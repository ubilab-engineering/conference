package functionalprogramming
import scala.annotation.tailrec




def fibonnaci(n: Int): Int = {
  if (n <= 1) n
  else fibonnaci(n - 1) + fibonnaci(n - 2)
}

fibonnaci(10)
fibonnaci(10000) // StackOverflowError AIE CARAMBA



def fib(n:Int) : Int = {

  @tailrec
  def fibTc(n:Int, a:Int, b:Int) : Int = {
    if (n <= 1) a
    else fibTc(n - 1, b, a + b)
  }
  if (n <= 1) n
  else
    fibTc(n - 1, 1, 1)
}


fib(10000)



case object Examples {

  case class SuperHero(name: String, age: Int, power: Option[String])

  val oTwo = Option(2)
  val none = Option.empty[Int]

  val listOfInt: Seq[Int] = List(1,2,3,4,5)
  val listOfInt2: Seq[Int] = List(1,2,3,4,5)
  val listOfInt3: Seq[Seq[Int]] = List(listOfInt,listOfInt2)
  val listOfInt4= List(oTwo,none)
}

Examples.oTwo.map(_ + 1)
Examples.none.map(_ + 1)
Examples.listOfInt.map(_ + 1)
Examples.listOfInt3.map(_.map(_ + 1)).flatten
Examples.listOfInt3.flatMap(_.map(_ + 1))
Examples.listOfInt4.map(_.map(_ + 1))
Examples.listOfInt4.flatMap(_.map(_ + 1))



