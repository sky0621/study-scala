package p2nd.chap02

/**
  *  2016/01/20.
  */
object M038_for_for extends App {
  val nl: List[List[String]] = List(
    List("Java", "C#", "Scala", "C++", "C"),
    List("PHP", "Perl", "Ruby", "JavaScript", "Python")
  )

  for(row <- nl; item <- row) println(item)
}
