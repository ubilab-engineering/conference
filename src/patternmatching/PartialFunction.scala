package patternmatching

object PartialFunction {


  val myString:PartialFunction[Int,String] = {
    case 0 => "le chiffre zéro"
    case o:Int if o > 100 => "le chiffre est super grand"
    case o:Int => o.toString
  }


  def main(args: Array[String]): Unit = {


    println(myString(0))
    println(myString(1))
    println(myString(2))
    println(myString(3))
    println(myString(4))
    println(myString(5))
    println(myString(150))
    println(myString(300))
    println(myString(450))


    val lInt = List(0,1,2,3,4,500)

    println(lInt.map(myString))

    println(

      lInt.filter({


      case p if p > 3 => true
      case _ => false










      }))
  }

}
