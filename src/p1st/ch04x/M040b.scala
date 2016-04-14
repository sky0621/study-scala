package p1st.ch04x

/**
  *  2015/12/23.
  */
object M040b {

  def main(args: Array[String]): Unit = {

    val lang: Int = 1

    val java = 0
    val scala = 1

    val ret: String = lang match {
      case `java` => "Java"
      case `scala` => "Scala"
      case _ => throw new IllegalArgumentException
    }

    println(ret)
  }
}
