package we.scala.core.extenders

import javax.jcr.Property

import org.apache.sling.commons.json.JSONObject

class PropertyExtender(property: Property) {
    def toJson: JSONObject = {
      val propJSON = new JSONObject
      propJSON.put(property.getName,property.getString)
      propJSON
    }
}
