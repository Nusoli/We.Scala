package we.scala.core

import org.apache.felix.scr.annotations._
import org.slf4j.LoggerFactory

@Component(
  label = "Scala Service Samples - Basic Scala OSGi Service",
  description = "Sample implementation of an Scala OSGi service",
  metatype = true,
  configurationFactory = true)
@Service(Array(classOf[GenService]))
class ScalaService extends GenService{
  val logger = LoggerFactory.getLogger(classOf[ScalaService])

  def printManifest() {
    val manifestFile = getClass.getResource("META-INF/MANIFEST.MF");
    logger.info(manifestFile.toString());
  }
}