package p2nd.redo.temp

/**
  *  2016/01/25.
  */
object Mxxx extends App {
  def saiki(lst: List[Int]): Unit = {
    lst match {
      case n :: nx => {
        println(n)
        saiki(nx)
      }
      case Nil => println("END")
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

  val l: List[Int] = List(3, 8, 9, 2, 5, 11)
  saikiAdd(l, 0)

}
