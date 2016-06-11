package we.scala.core.extenders
import scala.language.implicitConversions
import javax.jcr.{Property, Node}

object Extensions {
  implicit def extendNode(node: Node) = new NodeExtender(node)
  implicit def extendProperty(property: Property) = new PropertyExtender(property)
}
