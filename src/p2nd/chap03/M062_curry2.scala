package p2nd.chap03

/**
  *  2016/01/28.
  */
object M062_curry2 extends App {

  // 関数を定義
  val func = (greet: String, name: String) => greet + name
  // 関数をカリー化
  val curryfunc = func.curried

  // メソッドを定義
  def meth(greet: String, name: String) = greet + name
  // メソッドをカリー化
  val currymeth = (meth _).curried

  val titledcurryfunc = curryfunc("Hello, ")
  println(titledcurryfunc("Hanako"))

  val titledcurrymeth = currymeth("Good morning, ")
  println(titledcurrymeth("Umeko"))
}
