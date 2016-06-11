package we.scala.core
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.slf4j.LoggerFactory


class Activator extends BundleActivator {
  val logger = LoggerFactory.getLogger(classOf[Activator])

  def start(context: BundleContext) {
    logger.info("Activator - Scala Bundle started");
  }
  def stop(context: BundleContext): Unit ={
    logger.info("Activator - Scala Bundle stopped");
  }
}