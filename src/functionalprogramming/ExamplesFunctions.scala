package functionalprogramming


case object ExamplesHighOrderFunctions {

  val buf = scala.collection.mutable.ArrayBuffer.empty[Int]

  var  x = 0
  def maFunctionNaive: Int = {
    x = x * 2
    x = x * 3
    buf.addOne(x)
    x
  }


























//
//  def fois2(x: Int): Int = x * 2
//  def fois3(x: Int): Int = x * 2
//
//  def highOrderFunctionExample(f: Int => Int, x: Int): Int = f(x)
//
//
//  highOrderFunctionExample(fois2, 2)
//  highOrderFunctionExample(fois3, 2)


}

object Test extends App {
  println("Hello World")
}
