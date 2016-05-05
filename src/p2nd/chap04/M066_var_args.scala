package p2nd.chap04

/**
  *  2016/02/01.
  */
object M066_var_args extends App {

  // 可変長引数・・・型の後ろに「*」を付加
  def varargs(args: String*) = for(s <- args) println(s)

  varargs()

  varargs("3")

  varargs("Taro", "Jiro", "Saburo")

  val list = List("Java", "Go", "Scala")
  varargs(list: _*)
}
