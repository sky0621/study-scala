package master

/**
  * Created by Shotaro.S on 2016/05/05.
  */
object ValAndVar extends App {

  // 定数：再代入不可
  val i: Int = 333

  // 変数：再代入可
  var s: String = "Test"
  s = "Test2"

  // 遅延評価
  lazy val j: Int = i + 1 // この時点では演算されていない
  println(j)  // 使われてはじめて演算される

}
