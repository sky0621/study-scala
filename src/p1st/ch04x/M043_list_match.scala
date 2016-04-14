package p1st.ch04x

/**
  *  2015/12/24.
  */
object M043_list_match {

  def main(args: Array[String]): Unit = {

    val ary = List(1, 2, 3)
    listMatch(ary)
  }

  def listMatch(list: List[Int]) =
    list match {
      case List(1, 2, 3) => {
        println("len:3, arg:1,2,3")
      }
      case List(_, _) => {
        println("len:2, arg:_,_")
      }
      case List(a, b, c) => {
        println(a)
        println(b)
        println(c)
      }
      case _ => {
        println("Others")
      }
    }
}
