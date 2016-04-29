import akka.actor.{ActorSystem, Props}

/**
  * Created by trozozti on 29/04/16.
  */
object Main extends App {
  val system = ActorSystem("MicroMongoSystem")

  system.actorOf(Props[MongoActor], "mongoactor")

  println("Mongo Actor started, waiting for messages..")


}
