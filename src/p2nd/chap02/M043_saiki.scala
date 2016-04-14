package p2nd.chap02

/**
  *  2016/01/20.
  */
object M043_saiki extends App {
  def saiki(list: List[Int], sum: Int): Unit = {
    list match {
      case n :: nx => {
        println("先頭："+n)  // 先頭の要素を出力
        println("残り："+nx)
        saiki(nx, sum + n) // 残りの要素を持つリストで再帰
      }
      case Nil => println("End")
        println("サマリ："+sum)
    }
  }

  def saikiAdd(lst: List[Int], base: Int): Unit = {
    lst match {
      case n :: nx => {
        println("Now: " + n + ", Res: " + (n + base) )
        saikiAdd(nx, (n + base))
      }
      case Nil => println("end")
    }
  }

  val l: List[Int] = List(3, 7, 11, 15, 19)
  saiki(l, 0)
  println("----")
  saikiAdd(l, 0)
}
