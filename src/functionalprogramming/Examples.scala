package functionalprogramming


case object Examples {

  val oTwo = Option(2)
  val none = Option.empty[Int]
}

Examples.oTwo.map(_ + 1)
Examples.none.map(_ + 1)



