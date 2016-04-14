package p2nd.chap04

/**
  *  2016/02/04.
  */
object M070_byname_parameter extends App {

  // 名前渡し引数を使うと、引数が必要になったタイミングで評価される
  // [引数名: => 型]
  def hello(execute: Boolean, f: => Unit) = if(execute) f

  hello(true, println("Hello"))
  hello(false, println("Hello2"))

  def hello2(execute: Boolean, f: Unit) = if(execute) f

  hello2(false, println("Hello3"))
}
