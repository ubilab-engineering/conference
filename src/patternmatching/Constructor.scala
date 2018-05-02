package patternmatching

object MonSuperId {

  def apply(id:String) = s"${id}--user"

  def unapply(id:String): Option[String] =
    id.split("--").headOption
}


object Constructor {

  def main(args: Array[String]): Unit = {

    val userID = MonSuperId("234")

    println(userID)

    userID match {
      case MonSuperId(id) => println(id)
    }



  }

}
