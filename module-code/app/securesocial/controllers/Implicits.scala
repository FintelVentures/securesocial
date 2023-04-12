package securesocial.controllers

import play.api.mvc.QueryStringBindable

object Implicits {
  implicit def queryStringMapBindable(implicit stringBinder: QueryStringBindable[String]) = new QueryStringBindable[Map[String, String]] {
    def bind(key: String, params: Map[String, Seq[String]]): Option[Either[String, Map[String, String]]] = {
      val regex = s"^$key\\[(\\w+)\\]$$".r // e.g. matches "foo[bar]"
      Some(Right(params.flatMap {
        case (paramKey, values) =>
          paramKey match {
            case regex(mapKey) =>
              Some(mapKey -> values.head)
            case _ => None
          }
      }))
    }

    def unbind(key: String, value: Map[String, String]): String = {
      value.toList.map {
        case (mapKey, mapValue) =>
          stringBinder.unbind(s"${key}[${mapKey}]", mapValue)
      }.mkString("&")
    }
  }
}
