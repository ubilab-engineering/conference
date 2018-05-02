package patternmatching

object AnimauxFantastiquesAvecAge {

  trait animaux {
    def age: Int
  }

  case class Iguane(
      age: Int = 0
  ) extends animaux

  case class Lezard(
      age: Int = 0
  ) extends animaux

  case class Chien(
      age: Int = 0
  ) extends animaux

  case class Chat(
      age: Int = 0
  ) extends animaux

  def cri(animal: animaux): String =
    animal match {
      case o: Chat if o.age > 2           => "MOUAAAAOUUUU"
      case o: Chat                        => "miaou"
      case chien @ Chien(2) => "paf le chien a 2 ans"
      case o: Chien                       => "paf le chien"
      case o: Lezard                      => "euh"
      case _                              => "cet animal n'existe pas"
    }

  def main(args: Array[String]): Unit = {

    val rambo = Chat()

    val ramboPlusVieux = rambo.copy(age = 10)

    val rex = Chien()
    val rexa2ans = rex.copy(age = 2)

    println(cri(rambo))
    println(cri(ramboPlusVieux))
    println(cri(rex))
    println(cri(rexa2ans))

  }

}
