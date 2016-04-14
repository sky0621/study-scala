package p2nd.chap05

/**
  *  2016/03/24.
  */
object M112_List_for {
  def main(args: Array[String]): Unit = {
    val pgList: List[String] = List[String]("Scala", "Java", "C++", "Ruby", "PHP", "JavaScript", "Python", "Go")

    for(pg <- pgList) {
      print("[n]" + pg + " ")
    }

    println(" ")

    pgList.foreach( pg => print("[n]" + pg + " ") )

    println(" ")

    pgList.foreach {
      pg => print("[n]" + pg + " ")
    }

    println(" ")

    pgList.zipWithIndex.foreach {
      case(pg: String, idx: Int) => print("[%d]%s ".format(idx, pg))
    }
  }
}
