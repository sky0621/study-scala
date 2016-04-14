package p2nd.chap02

/**
  *  2016/01/13.
  */
object M016_lazy_val extends App {
  var i = 1
  var x = i + 1         // 通常は宣言時のこの時点で演算する
  lazy val y = i + 2    // lazyの場合はまだ演算されない

  println("--- 初期状態の x(=2), y(=3) ---")
  println(x)
  println(y)  // 評価時にはじめて演算される

  i = 2

  println("--- 対象値を「1 -> 2」にした後の x(=2), y(=3) ※プリミティブ値の演算なのでもう変更されない ---")
  println(x)
  println(y)

}
