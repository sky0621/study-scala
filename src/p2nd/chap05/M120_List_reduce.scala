package p2nd.chap05

/**
  *  2016/03/24.
  */
object M120_List_reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5).reduceLeft {
      (x, y) => x * y
    }
    println(list)

    val list2 = List(1, 2, 3, 4, 5)
    val res = (100 /: list2) { _ + _ }
    println(res)
    val res2 = (list2 :\ 50) { _ + _ }
    println(res2)
  }
}
