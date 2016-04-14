package p2nd.chap03

/**
  *  2016/01/27.
  */
object M058_method_to_function extends App {
  // メソッド(def)を関数型変数に代入
  def price(total: Int) = "金額：" + total
  val f: Int => String = price
  val f2 = price _  // 明示的に代入先に関数の型定義がされてない場合「_」をつける。＝部分適用

  println(f(500))
  println(f2(500))
  println("-----")

  // 別の関数型の引数に上記でメソッドを代入した関数を指定
  def printPrice(func: Int => String) = println(func(1000))
  printPrice(price)
  printPrice(f)
  printPrice(f2)
  println("-----")

  def printPrice2(price: Int => String) = println(price(1500))
  printPrice2(price)

}
