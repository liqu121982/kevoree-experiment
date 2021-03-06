package org.kevoree.experiment.smartForest.dpa

import ec.util.MersenneTwisterFast
import org.kevoree.library.tools.dpa.DPA
import org.kevoree.{ContainerRoot, NamedElement, ComponentType}
import scala.collection.JavaConversions._

import org.kevoree.tools.marShell.ast.{ComponentInstanceID, AddComponentInstanceStatment, TransactionalBloc, Script}

/**
 * User: ffouquet
 * Date: 18/07/11
 * Time: 17:22
 */


class AddForestMonitoringComponentDPA extends DPA {
  final val componentName: String = "component"

  def getComponentName = componentName

  final val typeDefinition: String = "type"
  final val nodeName: String = "node"

  def getNodeName = nodeName

  final val templateScript: String = "tblock { \n" + "  addComponent ${component}@${node} : ${type}\n" + "}"
  private var increment: Int = 0
  var componentTypes: java.util.HashMap[String, NamedElement] = null

  def applyPointcut(myModel: ContainerRoot): java.util.List[java.util.Map[String, NamedElement]] = {
    if (componentTypes == null) {
      componentTypes = new java.util.HashMap[String, NamedElement]
      for (typeDef <- myModel.getTypeDefinitions) {
        if (typeDef.isInstanceOf[ComponentType]) {
          componentTypes.put((typeDef.asInstanceOf[NamedElement]).getName, typeDef.asInstanceOf[NamedElement])
        }
      }
    }
    val results: java.util.List[java.util.Map[String, NamedElement]] = new java.util.ArrayList[java.util.Map[String, NamedElement]]
    for (containerNode <- myModel.getNodes) {
      var existTempSensor: Boolean = false
      var existSmokeSensor: Boolean = false
      var existHumiditySensor: Boolean = false
      for (myInstance <- containerNode.getComponents) {

        myInstance.getTypeDefinition.getName match {
          case "TempSensor" => existTempSensor = true
          case "SmokeSensor" => existSmokeSensor = true
          case "HumiditySensor" => existHumiditySensor = true
        }

      }
      if (!existHumiditySensor) {
        val myMap: java.util.Map[String, NamedElement] = new java.util.HashMap[String, NamedElement]
        myMap.put(this.typeDefinition, componentTypes.get("HumiditySensor"))
        myMap.put(this.nodeName, containerNode)
        results.add(myMap)
      }
      if (!existSmokeSensor) {
        val myMap: java.util.Map[String, NamedElement] = new java.util.HashMap[String, NamedElement]
        myMap.put(this.typeDefinition, componentTypes.get("SmokeSensor"))
        myMap.put(this.nodeName, containerNode)
        results.add(myMap)
      }
      if (!existTempSensor) {
        val myMap: java.util.Map[String, NamedElement] = new java.util.HashMap[String, NamedElement]
        myMap.put(this.typeDefinition, componentTypes.get("TempSensor"))
        myMap.put(this.nodeName, containerNode)
        results.add(myMap)
      }
    }
    return results
  }

  def getScript(myMap: java.util.Map[String, NamedElement]): String = {
    var script: String = templateScript
    import scala.collection.JavaConversions._
    for (name <- myMap.keySet) {
      val replacedString: String = "${" + name + "}"
      script = script.replace(replacedString, myMap.get(name).getName)
    }
    script = script.replace("${" + this.componentName + "}", myMap.get(this.typeDefinition).getName + ({
      increment += 1;
      increment
    }))
    return script
  }

  val random = new MersenneTwisterFast()

  def getASTScript(myMap: java.util.Map[String, NamedElement]): Script = {
    increment += 1;
    if (myMap == null){
      return null
    }
    val props = new java.util.Properties()
    val newIndex = random.nextInt(PeriodValues.values.size)

    props.put(ChangePeriodPropertyDPAO.periodPropertyName, PeriodValues.values(newIndex).toString)

    Script(
      List(
        TransactionalBloc(
          List(
            AddComponentInstanceStatment(
              ComponentInstanceID(myMap.get(typeDefinition).getName + increment, Some(myMap.get(nodeName).getName)),
              myMap.get(typeDefinition).getName,
              props
            )
          )
        )
      )
    )
  }


}