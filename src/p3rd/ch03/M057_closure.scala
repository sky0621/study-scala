package p3rd.ch03

/**
  * 2016/04/28.
  */
object M057_closure extends App {
  // timesをメソッドの引数として受け取り、それを使う関数を戻り値とする
  def outerMethod(times: Int) = (count: Int) => count * times

  val f = outerMethod(7)
  println(f(5))

  val ff = outerMethod(9)
  println(ff(2))
}
