package patternmatching

object ForComprehension {

  def main(args: Array[String]): Unit = {

    val result = for {
      x <- 1 to 10 if (x % 2 == 0)
      y <- 1 to 5
    } yield (x, y)

    println(result)

    val alwaysTrue = true


    def estVrai(boolean: Boolean): String =
      if (boolean)
        "vrai"
      else
        "faux"

    def estVraiWtf(boolean: Boolean): String = boolean match {
      case true => "vrai"
      case false => "faux"
    }

    def estVraiPartiel(boolean: Boolean) =
      if (boolean)
        "vrai"


    println(estVrai(true))
    println(estVrai(false))
    println(estVraiPartiel(true))
    println(estVraiPartiel(false))
  }

}
