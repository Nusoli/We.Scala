package we.scala.core

import javax.inject.Inject

import org.apache.sling.api.resource.{ResourceResolver, Resource}
import org.apache.sling.models.annotations.Model

@Model(adaptables = Array(classOf[Resource]))
class ScalaModel {

  @Inject
  val resourceResolver:ResourceResolver = null

  def getScalaModelResourceResolver: ResourceResolver = {
    resourceResolver
  }
}
