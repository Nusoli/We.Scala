package we.scala.core

import java.io.IOException
import javax.jcr.Node
import javax.servlet.ServletException

import org.apache.felix.scr.annotations.sling._
import org.apache.sling.api.resource.Resource
import org.apache.sling.api.{SlingHttpServletResponse, SlingHttpServletRequest}
import org.apache.sling.api.servlets.{OptingServlet, SlingAllMethodsServlet}
import org.apache.sling.commons.json.JSONArray
import org.slf4j.LoggerFactory

//This is used to automatically transform java.util.iterator to scala iterator
import scala.collection.JavaConversions.asScalaIterator


@SlingServlet(
  label = "Scala Sample - Sling All Methods Servlet",
  description = "Sample implementation of a Sling All Methods Servlet with Scala.",
  paths = Array("/services/scala-servlet"),
  methods = Array("GET"),
  metatype = true
)
class ScalaServlet extends SlingAllMethodsServlet with OptingServlet{

  val logger = LoggerFactory.getLogger(classOf[ScalaServlet])
  val InstallPath = "/apps/we-scalalib/install"

    @throws[ServletException]
    @throws[IOException]
    override def doGet(request:SlingHttpServletRequest,response:SlingHttpServletResponse) : Unit = {
      import we.scala.core.extenders.Extensions._

      logger.info("ScalaServlet - doGet")
      response.setContentType("application/json")
      try{
        val resource:Resource = request.getResourceResolver.getResource(InstallPath)
        val iterator = resource.listChildren
        val nodeArrayJSON = new JSONArray
        for(res <- iterator){
          val node:Node = res.adaptTo(classOf[Node])
          nodeArrayJSON put node.toJson.toString
        }
        response.getOutputStream println nodeArrayJSON.toString
      }catch {
        case e: Exception => logger error e.getMessage;
      }
    }

  override def accepts(request:SlingHttpServletRequest) : Boolean = {
    true
  }
}