package we.scala.core.extenders
import javax.jcr.{Property, Node}
import org.apache.sling.commons.json.{JSONArray, JSONObject}
import scala.collection.JavaConversions.asScalaIterator

class NodeExtender(node: Node) {
    def toJson: JSONObject = {
      val nodeJson = new JSONObject
      nodeJson.put("path",node.getPath)
      nodeJson.put("nodeType",node.getPrimaryNodeType.toString)
      val nodePropertiesJson = new JSONArray

      for(propertie <- node.getProperties){
        val prop:Property = propertie.asInstanceOf[Property]
        import we.scala.core.extenders.Extensions._
        nodePropertiesJson put prop.toJson
      }
      nodeJson.put("properties",nodePropertiesJson)
      nodeJson
    }
}
