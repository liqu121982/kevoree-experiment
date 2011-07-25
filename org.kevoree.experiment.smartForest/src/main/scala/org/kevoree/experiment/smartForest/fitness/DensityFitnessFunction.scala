package org.kevoree.experiment.smartForest.fitness

import scala.collection.JavaConversions._
import org.kevoree.library.reasoner.ecj.GeneticAlgorithm
import org.kevoree.{NamedElement, ContainerNode, ContainerRoot}

/**
 * User: ffouquet
 * Date: 22/07/11
 * Time: 15:29
 */

class DensityFitnessFunction extends FitnessFunction {

  final val tempSensor: String = "TempSensor"
  final val smokeSensor: String = "SmokeSensor"
  final val humiditySensor: String = "HumiditySensor"
  final val worseDensity: Double = 0.0

  def evaluate(model: ContainerRoot): Float = {

    var densityV = 0.0;
    for (i <- 0 until model.getNodes.size()) {
      val myNode = model.getNodes.get(i);
      if (!containsInstance(myNode, tempSensor)) {
        densityV += density(model, tempSensor, i)
      }
      if (!containsInstance(myNode, smokeSensor)) {
        densityV += density(model, smokeSensor, i)
      }
      if (!containsInstance(myNode, humiditySensor)) {
        densityV += density(model, humiditySensor, i)
      }
    }
    java.lang.Math.floor(densityV * 100 / worseDensity).toFloat;
  }


  def density(myModel: ContainerRoot, myType: String, indice: Int): Double = {
    var density: Double = 0.0
    val i: Int = indice / GeneticAlgorithm.forestWidth
    val j: Int = indice - (i * GeneticAlgorithm.forestWidth)
    var minDiffI: Int = -1
    var minDiffJ: Int = -1
    var maxDiffI: Int = 1
    var maxDiffJ: Int = 1
    if (i == 0) minDiffI = 0
    if (j == 0) minDiffJ = 0
    if (i == GeneticAlgorithm.forestWidth - 1) maxDiffI = 0
    if (j == GeneticAlgorithm.forestWidth - 1) maxDiffJ = 0
    for (k <- minDiffI until maxDiffI) {
      for (l <- minDiffJ until maxDiffJ) {
        if (!(k == 0 && l == 0)) {
          density += calculateInDirection(myModel, k, l, myType, indice);
        }
      }
    }
    density
  }

  def calculateInDirection(myModel: ContainerRoot, diffI: Int, diffJ: Int, myType: String, indice: Int): Double = {
    var i: Int = indice / GeneticAlgorithm.forestWidth
    var j: Int = indice - (i * GeneticAlgorithm.forestWidth)
    if (i == 0 || i == GeneticAlgorithm.forestWidth - 1 || j == 0 || j == GeneticAlgorithm.forestWidth - 1) {
      return 1
    }
    i += diffI
    j += diffJ
    val newIndice: Int = i * GeneticAlgorithm.forestWidth + j
    val myNode: ContainerNode = myModel.getNodes.get(newIndice)
    if (containsInstance(myNode, myType)) {
      1
    }
    else {
      1 + calculateInDirection(myModel, diffI, diffJ, myType, newIndice)
    }
  }

  def containsInstance(myNode: ContainerNode, componentName: String): Boolean = {
    myNode.getComponents.find {
      component => component.getName == componentName
    }.isDefined
  }


}