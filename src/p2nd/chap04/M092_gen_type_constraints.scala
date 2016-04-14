package p2nd.chap04

/**
  *  2016/02/17.
  */
object M092_gen_type_constraints extends App {
  val hw: M092_HelloWorld[String] = new M092_HelloWorld[String]("Test")
  hw.print

  val hw2: M092_HelloWorld[Int] = new M092_HelloWorld[Int](35)
//  hw2.print

}

class M092_HelloWorld[A](param: A) {
  // 型パラメータが String の場合のみ println(param) を実行可能。そうでないとエラーになる。
  def print(implicit evidence: A =:= String) = println(param)

}