package p1st.ch04x

/**
  *  2015/12/24.
  */
object M047 {

  def main(args: Array[String]): Unit = {

    val tpl: (Any, Any) = (3, 3)

    tpl match {
      case (x, y) if x == y => {
        println("True!")
      }
      case _ => {
        println("Others!")
      }
    }
  }
}
