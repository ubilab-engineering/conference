package patternmatching

object AnimauxFantastiquesAvecAgeEtNom {

  trait animaux {
    def age: Int
    def nom: String
  }

  case class Iguane(
      age: Int = 0,
      nom: String = "robert"
  ) extends animaux

  case class Lezard(
      age: Int = 0,
      nom: String = "maxime"
  ) extends animaux

  case class Chien(
      age: Int = 0,
      nom: String = "medor"
  ) extends animaux

  case class Chat(
      age: Int = 0,
      nom: String = "mistigri"
  ) extends animaux

  case class EtoileDeMer(
      age: Int = 0,
      nom: String = "luc"
  ) extends animaux

  def cri(animal: animaux): String =
    animal match {
      case o: Chat if o.age > 2 => "MOUAAAAOUUUU"
      case o: Chat              => "miaou"
      case chien @ Chien(2,_)     => "paf le chien a 2 ans"
      case patrick @ EtoileDeMer(_,"patrick")     => "Copain de bob l'éponge"
      case Chien(age,nom)             => s"${nom} le chien à ${age} ans"
      case o: Lezard            => "euh"
      case _                    => "cet animal n'existe pas"
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
