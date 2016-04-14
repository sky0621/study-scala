package p2nd.chap04

/**
  *  2016/02/01.
  */
object M064_class extends App {

  val instance = new HelloWorld

  val outer = new Outer
  val inner = new outer.Inner

  outer.hello()
  outer.ihello()

  inner.hello()

  val outer2 = new Outer
  var inner2: Outer#Inner = new outer.Inner
  inner2 = new outer2.Inner
  inner2.hello()

  println(outer2.user)

  // AnyRefを継承した無名クラス
  val inst = new {
    def greet: Unit = println("Greeting!")
  }

  inst.greet
}

class HelloWorld {

}

class Outer {
  def hello(): Unit = println("Hello Outer.")
  def ihello(): Unit = new Inner().hello()

  class Inner {
    def hello(): Unit = println("Hello Inner.")
  }

  def user: (Int, String) = (1, "Taro")

}
