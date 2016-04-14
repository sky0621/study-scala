package p2nd.chap03

/**
  *  2016/01/27.
  */
object M059_bubun_tekiyo extends App {
  def price(total: Int, discount: Int) = total - discount

  // totalが1000円であることは決まっているがdiscountはこの時点では決まっていない関数型変数を作成
  val f1 = price(1000, _: Int)
  println(f1(200))

  // totalもdiscountも全ての引数が決まっていない関数型変数を作成
  val f2 = price _
  println(f2(2000, 300))
}
