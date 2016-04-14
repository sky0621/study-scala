package p1st.ch04x

/**
  *  2015/12/24.
  */
object M049 {

  def main(args: Array[String]): Unit = {

    val func: String => Unit = {
      _ match {
        case "Scala" => println("Scala!")
        case "Not Scala" => println("Not Scala!")
      }
    }
  }
}
