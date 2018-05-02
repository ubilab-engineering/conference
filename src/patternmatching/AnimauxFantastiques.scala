package patternmatching

object AnimauxFantastiques {

  trait animaux

  case class Iguane() extends animaux

  case class Lezard() extends animaux

  case class Chien() extends animaux

  case class Chat() extends animaux

  def cri(animal: animaux): String =
    animal match {
      case o: Chat => "miaou"
      case o: Chien => "paf le chien"
      case o: Lezard => "euh"
      case fourre_tout => "cet animal n'existe pas"
      case _ => "cet animal n'existe pas"
    }

  def main(args: Array[String]): Unit = {

    val rambo = Chat()

    println(cri(rambo))

  }

}
