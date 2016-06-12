package we.scala.core
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.slf4j.LoggerFactory
import we.scala.core.trt.Loggable


class Activator extends BundleActivator with Loggable {

  def start(context: BundleContext) {
    info("Activator - Scala Bundle started");
  }
  def stop(context: BundleContext): Unit ={
    info("Activator - Scala Bundle stopped");
  }
}