package p2nd.chap03

/**
  *  2016/01/27.
  *
  * 【カリー化】
  * 　引数が複数ある関数を引数１個の関数のチェーンとして呼べるよう変換すること
  *
  * 【部分適用】
  * 　引数の一部に値を渡して呼び出すこと
  */
object M061_curry extends App {
  // 引数が複数ある関数（またはメソッド）を、１つの引数を持つ関数のチェーンとして呼び出せるよう変換すること

  // (引数名：型）が引数リスト
  // まず(title: String)を渡し、それから(name: String)を渡し、title+nameを返す
  val greetFunc = (title: String) => (name: String) => title + name

  // 最初から greetFunc(title: String, name: String) => title + nameとも書けるが、そうするとチェーンとして呼び出せない
  val greetFuncOrg = (title: String, name: String) => title + name

  println(greetFunc("Hello! ")("Taro"))
  println(greetFuncOrg("Hello! ", "Jiro"))

  // メソッドもカリー化
  def greetDef(title: String)(name: String) = title + name

  println(greetDef("Hey!! ")("Saburo"))

  println("-----")
  println("引数を順番に適用していく")
  val hello = greetFunc("Good Morning! ")
  println(hello)
  println(hello("Shiro"))

  println("-----")
  println("メソッド版")
  def greet(f: String => String) = f("Yuito")
  println(greet(greetDef("Good Evening! ")))

  val hello2 = greetDef("HeyHey ") _
  println(hello2("Goro"))

  println("-----")
  println("メソッドをカリー化して定義。")
  def execute(data: List[String])(f: List[String] => String) = {
    f(data)
  }

  val list = List("Java", "Go", "Scala", "PHP")
  val res = execute(list) { data => data.toString() }
  println(res)
}
