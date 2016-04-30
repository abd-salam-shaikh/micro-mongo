package mongo

import com.google.inject.Singleton
import com.mongodb.client.model.Filters
import org.mongodb.scala.{Completed, Document, MongoDatabase}
import play.api.libs.json.{JsObject, Json}

import scala.concurrent.Future

@Singleton
class MongoCollectionFactory {

  def makeCollection(collName: String, db: MongoDatabase = Mongo.db) = new MongoCollection(collName, db)

  class MongoCollection(val collName: String, db: MongoDatabase) {

    def coll = db.getCollection(collName)

    def find() = {
      coll.find(Filters.ne("_id", 1)).map { doc =>
        Json.parse(doc.toJson()).as[JsObject]
      }
    }

    def insert(data: JsObject): Future[Completed] = {
      coll.insertOne(Document(data.toString())).head()
    }

  }

}
