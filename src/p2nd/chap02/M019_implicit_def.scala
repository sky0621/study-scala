package p2nd.chap02

/**
  *  2016/01/13.
  */
object M019_implicit_def extends App {
  implicit def toStr(num: Int): String = {
    if(num <= 10) "10アンダー"
    else "10オーバー"
  }

  val num1: Int = 9
  val num2: Int = 11
  val str1: String = num1
  val str2: String = num2
  println(str1)
  println(str2)
}
