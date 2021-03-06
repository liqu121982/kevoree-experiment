package org.kevoree.experiment.smartForest.experiment

import org.kevoree.library.tools.dpa.DPA
import org.kevoree.tools.marShell.interpreter.{KevsInterpreterAspects, KevsInterpreterContext}
import ec.util.Parameter
import org.kevoree.kompare.KevoreeKompareBean
import java.io.File
import org.kevoree.library.reasoner.ecj.KevoreeDefaults
import ec.{Individual, EvolutionState}
import org.kevoree.framework.KevoreeXmiHelper
import org.kevoree.cloner.ModelCloner
import org.kevoree.{ContainerRoot}
import org.kevoree.experiment.smartForest.references.ModelGenerator
import org.kevoree.experiment.smartForest.results.RIndividuGenerator
import org.kevoree.experiment.smartForest.{SmartForestExperiment, InitParam}
import org.kevoreeadaptation.AdaptationModel

/**
 * Created by IntelliJ IDEA.
 * User: jbourcie
 * Date: 25/07/11
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */

object KevoreeIndividualAbstractO {
  var increment = 0

  def getNextModelName: String = {
    increment += 1
    "Models" + increment
  }
}

abstract class KevoreeIndividualAbstract extends Individual {

  var mutationDpas: Array[DPA]
  var minMutationDpasNumber: Int
  var maxMutationDpasNumber: Int

  var resetDpas: List[DPA]
  var minResetDpasNumber: Int
  var maxResetDpasNumber: Int

  val baseModelPath: String

  val P_KEVOREE_INDIVIDUAL: String = "kev-ind"
  val FOLDER_TO_STORE_MODELS: String = "models-folder"

  var myModel: ContainerRoot = null

  private var model_path: String = null


  /**
   * Destructively mutates the individual in some default manner.
   */
  def defaultMutate(state: EvolutionState, thread: Int): Unit = {
    val context = new KevsInterpreterContext(myModel)
    var numberOfMutation = minMutationDpasNumber
    if (maxMutationDpasNumber != minMutationDpasNumber)
      numberOfMutation = minMutationDpasNumber + state.random(thread).nextInt(maxMutationDpasNumber - minMutationDpasNumber)
    (1 to numberOfMutation).foreach {
      _ =>
        val myDPA = mutationDpas(state.random(thread).nextInt(mutationDpas.length))
        val myLists = myDPA.applyPointcut(myModel)
        if (!myLists.isEmpty) {
          val myMap = myLists.get(state.random(thread).nextInt(myLists.size))
          val script = myDPA.getASTScript(myMap)
          KevsInterpreterAspects.rich(script).interpret(context)
        }
    }
  }


  var isFirst = true

  /**
   * Initializes the individual.
   */
  def reset(state: EvolutionState, thread: Int): Unit = {

    var initVar = System.getProperty("INIT_VAR")
    initVar match {
      case "EMPTY_INIT" => {
        myModel = KevoreeXmiHelper.instance$.loadStream(this.getClass.getClassLoader.getResourceAsStream("defaultLibrary.kev"))
      }
      case "FULL_INIT" => {
        myModel = ModelGenerator.generateForest(SmartForestExperiment.forestWidth)
      }
      case "HUMAN_INIT" => {
        myModel = ModelGenerator.generateForest(SmartForestExperiment.forestWidth)
        RIndividuGenerator.generateIndividualRRepresentation(myModel)
      }

      case _ => {
        val context = new KevsInterpreterContext(myModel)
        var numberOfMutation = minResetDpasNumber
        if (maxResetDpasNumber != minResetDpasNumber)
          numberOfMutation = minResetDpasNumber + state.random(thread).nextInt(maxResetDpasNumber - minResetDpasNumber)
        (1 to numberOfMutation).foreach {
          _ =>
            val myDPA = resetDpas(state.random(thread).nextInt(resetDpas.length))
            val myLists = myDPA.applyPointcut(myModel)
            if (!myLists.isEmpty) {
              val myMap = myLists.get(state.random(thread).nextInt(myLists.size))
              val script = myDPA.getASTScript(myMap)
              KevsInterpreterAspects.rich(script).interpret(context)
            }
        }


        /*if (isFirst) {
          var cumul = 0f

          val confidenceScore = SmartForestFitnessEvaluatorO.getConfidenceFitnessFunction.evaluate(myModel)
          val densityScore = SmartForestFitnessEvaluatorO.getDensityFitnessFunction.evaluate(myModel)
          val consumptionScore = SmartForestFitnessEvaluatorO.getConsumptionFitnessFunction.evaluate(myModel)
          cumul = 300 - (confidenceScore+densityScore+consumptionScore)
          println(cumul+",")
        }

        isFirst = false
        */
      }

    }


  }

  def defaultCrossover(state: EvolutionState, thread: Int, ind: KevoreeIndividualAbstract): Unit = {}

  def getGenome: AnyRef = {
    return myModel
  }

  def setGenome(gen: AnyRef): Unit = {
    if (gen.isInstanceOf[ContainerRoot]) {
      this.myModel = gen.asInstanceOf[ContainerRoot]
    }
  }

  def genomeLength: Int = {
    return size.asInstanceOf[Int]
  }

  def defaultBase: Parameter = {
    return KevoreeDefaults.base.push(P_KEVOREE_INDIVIDUAL)
  }


  val modelCloner = new ModelCloner

  override def clone: AnyRef = {
    val ki: KevoreeIndividualAbstract = super.clone.asInstanceOf[KevoreeIndividualAbstract]
    //val stringModel = KevoreeXmiHelper.saveToString(myModel,false)
    ki.myModel = modelCloner.clone(myModel)
    ki.mutationDpas = mutationDpas
    ki.minMutationDpasNumber = minMutationDpasNumber
    ki.maxMutationDpasNumber = maxMutationDpasNumber
    ki.resetDpas = resetDpas
    ki.minResetDpasNumber = minResetDpasNumber
    ki.maxResetDpasNumber = maxResetDpasNumber
    return ki
  }

  override def equals(ind: Any): Boolean = {
    if (!(ind.isInstanceOf[KevoreeIndividualAbstract])) {
      return false
    }
    if (myModel.getNodes.size != ind.asInstanceOf[KevoreeIndividualAbstract].myModel.getNodes.size) {
      return false
    }
    val kkb = new KevoreeKompareBean
    import scala.collection.JavaConversions._
    myModel.getNodes.foreach {
      cn =>
        val am = kkb.kompare(myModel, ind.asInstanceOf[KevoreeIndividualAbstract].myModel, cn.getName)
        if (!am.getAdaptations.isEmpty) {
          return false
        }
    }
    return true
  }

  override def hashCode: Int = {
    return myModel.hashCode
  }

  override def size: Long = {
    var count: Int = 0
    import scala.collection.JavaConversions._
    myModel.getNodes.foreach {
      cn =>
        count += cn.getComponents.size
    }
    return count
  }

  override def setup(state: EvolutionState, base: Parameter): Unit = {
    myModel = KevoreeXmiHelper.instance$.load(baseModelPath)
    model_path = state.parameters.getString(base.push(FOLDER_TO_STORE_MODELS), null)

    var stat: File = new File(model_path)
    if (stat.isDirectory) {
      for (file <- stat.listFiles) {
        file.delete
      }
      stat.delete
    }
    model_path = model_path + File.separator
  }


  override def toString: String = {
    //val path = model_path + KevoreeIndividualAbstractO.getNextModelName
    // KevoreeXmiHelper.save(path, myModel)
    // return path
    ""
  }

  override def distanceTo(otherInd: Individual): Double = {
    var result: Double = 0.0
    val kkb = new KevoreeKompareBean
    import scala.collection.JavaConversions._
    myModel.getNodes.foreach {
      cn =>
        val am: AdaptationModel = kkb.kompare(myModel, (otherInd.asInstanceOf[KevoreeIndividualAbstract]).myModel, cn.getName)
        result += am.getAdaptations.size
    }
    return result
  }

  /*private def compare(ki: KevoreeIndividualAbstract): List[Statment] = {
    var amAggregated: AdaptationModel = null
    var kkb: KevoreeKompareBean = new KevoreeKompareBean
    for (cn : ContainerNode <- myModel.getNodes) {
      var am: AdaptationModel = kkb.kompare(myModel, ki.myModel, cn.getName)
      if (amAggregated == null) {
        amAggregated = am
      }
      else {
        amAggregated.getAdaptations.addAll(am.getAdaptations)
      }
    }
    if (amAggregated != null) {
      var result = new ArrayList[Statment]
      var script: Script = AdaptationModelWrapper.generateScriptFromAdaptModel(amAggregated)
      var it: Iterator[Block] = script.blocks.iterator
      while (it.hasNext) {
        var itStatment: Iterator[Statment] = it.next.l.iterator
        while (itStatment.hasNext) {
          result.add(itStatment.next)
        }
      }
      return result
    }
    return null
  }*/

}