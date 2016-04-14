package p1st.ch03x

/**
  *  2015/12/23.
  */
object M038_nestedList_forloop {

  def main(args: Array[String]): Unit = {

    for(x <- 1 to 5; y <- 2 to 6){
//      println("x=%d, y=%d".format(x, y))
//      println(x*y)
    }

    var nested = List(
      List("C", "C++", "Java", "C#", "Scala"),
      List("JavaScript", "Ruby", "PHP", "Python")
    )

    var t = for(line <- nested; lang <- line if lang.contains("a")) yield lang.toLowerCase()
    println(t)

  }
}
