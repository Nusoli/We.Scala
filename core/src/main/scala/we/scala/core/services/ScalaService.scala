package we.scala.core.services

import org.apache.felix.scr.annotations._
import org.slf4j.LoggerFactory
import we.scala.core.services.trt.GenService
import we.scala.core.trt.Loggable

@Component(
  label = "Scala Service Samples - Basic Scala OSGi Service",
  description = "Sample implementation of an Scala OSGi service",
  metatype = true,
  configurationFactory = true)
@Service(Array(classOf[GenService]))
class ScalaService extends GenService with Loggable{

  def printManifest() {
    val manifestFile = getClass.getResource("META-INF/MANIFEST.MF");
    info(manifestFile.toString());
  }
}