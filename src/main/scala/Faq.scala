import play.api.libs.json.JsObject

/**
  * Created by trozozti on 29/04/16.
  */
trait Faq

case class FaqDocument(jsObject: JsObject) extends Faq
