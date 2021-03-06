package org.kevoree.experiment.trace.gui.alg

import org.kevoree.experiment.trace.TraceMessages.{Trace, Traces}
//import scala.collection.JavaConversions._

object TracePath {

  def getAllPathFrom(nodeID: String, firstNodeVersion: Int, traces: Traces): List[LinkedTrace] = {
    var result: List[LinkedTrace] = List()
    var firstIndex = firstNodeVersion
    var subResult = getPathFrom(nodeID, firstIndex, traces)
    while (!subResult.isEmpty) {
      result = result ++ List(subResult.get)
      //NEXT ITERATION
      firstIndex = firstIndex + 1
      subResult = getPathFrom(nodeID, firstIndex, traces)
    }
    result
  }


  //HELPER
  def stringToVectorClock(content: String): VectorClock = {
    val tmps = content.split(";")
    var result = VectorClock(List(), "", 0l)

    tmps.size match {
      case 1 => {
        tmps(0).split(',').foreach {
          entry =>
            val values = entry.split(':')
            if (values.size >= 2) {
              val nodeID = values(0)
              val nodeVersion = Integer.parseInt(values(1).trim)
              result = VectorClock(result.entries.toList ++ List((nodeID, nodeVersion)), "", 0l)
            }
        }
      }
      case 2 => {
        tmps(1).split(',').foreach {
          entry =>
            val values = entry.split(':')
            if (values.size >= 2) {
              val nodeID = values(0)
              val nodeVersion = Integer.parseInt(values(1).trim)
              result = VectorClock(result.entries.toList ++ List((nodeID, nodeVersion)), tmps(0), 0l)
            }
        }
      }
      case 3 => {
        tmps(1).split(',').foreach {
          entry =>
            val values = entry.split(':')
            if (values.size >= 2) {
              val nodeID = values(0)
              val nodeVersion = Integer.parseInt(values(1).trim)
              result = VectorClock(result.entries.toList ++ List((nodeID, nodeVersion)), tmps(0), java.lang.Long.parseLong(tmps(2)))
            }
        }
      }
    }

    result
  }


  //INIT SEARCH PATH
  def getPathFrom(nodeID: String, nodeVersion: Int, traces: Traces): Option[LinkedTrace] = {
    import scala.collection.JavaConversions._
    val sortedTraces = traces.getTraceList.toList.sortWith((x, y) => x.getTimestamp < y.getTimestamp)

    //SEARCH FOR FIRST TRACE OCCURENCE
    /*   println("hihi"+sortedTraces.size)
 sortedTraces.foreach{trace =>
   println(trace.getClientId)

 }   */

    sortedTraces.find(trace => trace.getClientId == nodeID
      && stringToVectorClock(trace.getBody).containEntry(nodeID, nodeVersion)
      && stringToVectorClock(trace.getBody).source != ""
    ) match {
      case Some(traceRoot) => {
        val linkedtraceRoot = buildLinkedFor(sortedTraces, traceRoot, nodeID, nodeVersion, nodeID, nodeVersion)
        Some(linkedtraceRoot)
      }
      case None => None
    }
  }

  /* Build recursively successor for trace with precise nodeID & Version  */
  protected def buildLinkedFor(traces: List[Trace], trace: Trace, nodeID: String, version: Int, originID: String, originVersion: Int): LinkedTrace = {

    if (traces.isEmpty) {
      LinkedTrace(trace, List())
    } else {
      val tracesWithoutTrace = traces.slice(traces.indexOf(trace) + 1, traces.indexOf(traces.last) + 1)
      val successors = lookForSuccessor(tracesWithoutTrace, nodeID, version, originID, originVersion)
      var result = LinkedTrace(trace, List())
      successors.foreach {
        suc =>
        //IF A NODE IS ALREADY TOUCH BY ANY SUB LINKED TRACE
          if (!result.sucessors.exists(subSuc => subSuc.rcontainsNodeId(suc._1._1))) {
            val optimizedTraces = traces.slice(traces.indexOf(suc._2) + 1, traces.indexOf(traces.last) + 1)
            result = LinkedTrace(trace, result.sucessors ++ List(buildLinkedFor(optimizedTraces, suc._2, suc._1._1, suc._1._2, originID, originVersion)))
          }
      }
      result
    }
  }

  /* Look for direct successor of a precise version */
  protected def lookForSuccessor(traces: List[Trace], nodeID: String, version: Int, originID: String, originVersion: Int): List[((String, Int), Trace)] = {
    if (traces.isEmpty) {
      return List()
    }
    val headVector = stringToVectorClock(traces.head.getBody)
    val containPrevious = headVector.containEntry(nodeID, version)
    val isFromSourceNode = headVector.source == nodeID

    val isSup = headVector.versionForNode(originID).getOrElse(originVersion) == originVersion

    // val previousTrace = 0findPreviousTrace(traces.head, traces, nodeID, version)
    // val alreadyNew  = isAlreadyNew(previousTrace, traces.head, nodeID, version)
    //println("previous trace is also an updated trace so the current trace is not a direct successor")
    // println("trace => " + previousTrace.getBody)
    var lvalue: List[((String, Int), Trace)] = List()
    if (containPrevious /*&& notContainPrevious*/ && isFromSourceNode && isSup) {
      //foundDirectSuccessors2 = foundDirectSuccessors2 ++ List((traces.head.getClientId, headVector.versionForNode(traces.head.getClientId).get))
      lvalue = List(((traces.head.getClientId, headVector.versionForNode(traces.head.getClientId).get), traces.head))
    }
    if (!traces.tail.isEmpty) {
      lvalue ++ lookForSuccessor(traces.tail, nodeID, version, originID, originVersion)
    } else {
      lvalue
    }
  }

  /**
   *
   * @return true if there is only one difference between previous and current trace. This difference is about version of nodeId (equals to version -1 for the previous trace), false else
   */
  /*
  private def isAlreadyNew(previousTrace : Trace, currentTrace : Trace, nodeId : String, version : Int) : Boolean ={
    val currentTraceVectorClock = stringToVectorClock(currentTrace.getBody)
    val previousTraceVectorClock = stringToVectorClock(previousTrace.getBody)
    currentTraceVectorClock.entries.forall{
      t =>
        (t._1.equals(nodeId) && t._2.equals(version - 1)) || previousTraceVectorClock.containEntry(t._1, t._2)
    }
  }*/


  /**
   * look for the previous trace where the version for nodeId is equals to version -1 compared to the current trace
   */
  /*
  private def findPreviousTrace(trace : Trace, traces : List[Trace], nodeId : String, version : Int) : Trace = {
    var reverseTraces = traces.reverse
    var t = reverseTraces.head
    while (!t.getClientId.equals(trace.getClientId) && !stringToVectorClock(t.getBody).containEntry(nodeId, version -1)) {
      reverseTraces = reverseTraces.tail
      t = reverseTraces.head
    }
    t
  }
*/


  /**
   * the state of the system is stable when we find into the traces at least one trace for each node where
   * the version for nodeId is equals to version
   *
   */
  def isStable(traces: List[Trace], nodeId: String, version: Int, nbNodes: Int): Boolean = {
    val reverseTraces = traces.reverse
    var found: List[String] = List[String]()
    var i = 0
    while (found.size <= nbNodes && i < traces.size) {
      if (TracePath.stringToVectorClock(reverseTraces(i).getBody).containEntry(nodeId, version) && !found.contains(reverseTraces(i).getClientId)) {
        found = found ++ List(reverseTraces(i).getClientId)
      }
      i = i + 1
    }
    found.size == nbNodes
  }


}