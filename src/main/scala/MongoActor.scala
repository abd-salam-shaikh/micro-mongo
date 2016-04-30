import akka.actor.Actor
import mongo.MongoCollectionFactory
import play.api.libs.json.JsObject

/**
  * Created by trozozti on 29/04/16.
  */
class MongoActor extends Actor {

  private val coll = new MongoCollectionFactory().makeCollection("faq")

  override def receive = {
    case doc@JsObject(_) =>
      println(s"inserting to mongodb: $doc")
      coll.insert(doc)
    case _ =>
      println(s"unexpected msg")
  }

}
