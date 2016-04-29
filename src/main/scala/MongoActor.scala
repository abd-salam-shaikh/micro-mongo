import akka.actor.Actor
import play.api.libs.json.JsObject

/**
  * Created by trozozti on 29/04/16.
  */
class MongoActor extends Actor {

  override def receive = {
    case JsObject(doc) =>
      println(doc)
    case _ =>
      println(s"unexpected msg")
  }

}
