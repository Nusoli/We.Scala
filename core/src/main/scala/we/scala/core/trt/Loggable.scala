package we.scala.core.trt

import org.slf4j.LoggerFactory

trait Loggable {
  self =>

  val logger = LoggerFactory.getLogger(self.getClass)

  def debug[T](msg: => T):Unit = {
    if (logger.isDebugEnabled()) logger.debug(msg.toString)
  }
  def error[T](msg: => T):Unit = {
    if (logger.isErrorEnabled()) logger.error(msg.toString)
  }
  def info[T](msg: => T):Unit = {
    if (logger.isInfoEnabled()) logger.info(msg.toString)
  }
}