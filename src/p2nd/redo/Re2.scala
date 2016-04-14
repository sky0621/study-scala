package p2nd.redo

/**
  *  2016/03/24.
  */
object Re2 {
  def main(args: Array[String]): Unit = {
    val list: List[String] = List[String]("PHP", "Go", "Java8", "Scala", "Clojure", "Ruby")
    val res = list.map { pg => pg.toUpperCase() }
    println(res)

    val neo  = list.filter( pg => pg.length > 4 )
    println(neo)

    val map = Map[Int, String](
      10 -> "PHP",
      20 -> "Go",
      30 -> "Java8"
    )
    println(map)
  }
}
