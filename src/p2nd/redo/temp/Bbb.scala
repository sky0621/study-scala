package p2nd.redo.temp

/**
  *  2016/02/03.
  */
object Bbb {
  def main(args: Array[String]): Unit = {
    val f1: Int => Int = _ * 5
    val f2 = (_: Int) * (_: Int)
    println(f2(5, 5))


  }

}
