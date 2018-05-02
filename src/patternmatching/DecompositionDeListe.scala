package patternmatching

object DecompositionDeListe {

  def length[A](list: List[A]): Int = list match {
    case Nil    => 0
    case h :: h2 :: t => 1 + length(h2 :: t)
    case h :: t => 1 + length(t)
  }

  def main(args: Array[String]): Unit = {}

}
