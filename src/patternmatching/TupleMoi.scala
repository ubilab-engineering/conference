package patternmatching

object TupleMoi {

  def main(args: Array[String]): Unit = {

    val tupleEntier = (1, 2, 3)

    println(tupleEntier match {
      case (p1, p2, p3) =>
        s"""
          |p1 = ${p1}
          |p2 = ${p2}
          |p3 = ${p3}
        """.stripMargin
    })

  }

}
