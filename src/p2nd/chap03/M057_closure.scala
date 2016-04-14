package p2nd.chap03

/**
  *  2016/01/27.
  */
object M057_closure extends App{
  // 関数生成時に外部の変数（自由変数）を取り込む

  def multi(times: Int) = (i: Int) => i * times

  val fiveMulti = multi(5)
  println(fiveMulti(6))

  println(multi(150)(2))
}
