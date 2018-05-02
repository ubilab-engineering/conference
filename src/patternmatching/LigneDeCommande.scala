package patternmatching

object LigneDeCommande {



  def ouiNon(choix:Int):String = choix match {
    case 1 => "oui"
    case 0 => "non"
    case _ => "erreur"
  }



  def ouiNonErreur(choix:Int):String = choix match {
    case 1 => "oui"
    case 0 => "non"
    case erreur => "erreur"
  }


  def ouiNonAvecChoix(choix:Int):String = choix match {
    case 1 | 2 | 3 => "soleil"
    case 0 => "non"
    case _ => "erreur"
  }


  def ouiOuNonPermissif(choix:Any):String = choix match {
    case 1 | "1" => "oui"
    case 0 | "0" => "non"
  }

  def main(args: Array[String]): Unit = {


    println(ouiOuNonPermissif(1))
    println(ouiOuNonPermissif(0))
    println(ouiOuNonPermissif("1"))

  }

}
