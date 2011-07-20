package org.kevoree.experiment.smartbuilding
import org.kevoree.framework.port._
import scala.{Unit=>void}
class FloorAlarmPORTforward(component : FloorAlarm) extends org.kevoree.framework.MessagePort with KevoreeRequiredPort {
def getName : String = "forward"
def getComponentName : String = component.getName 
def process(o : Object) = {this ! o}
def getInOut = false
}
