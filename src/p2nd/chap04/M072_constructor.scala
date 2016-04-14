package p2nd.chap04

/**
  *  2016/02/04.
  */
object M072_constructor extends App {
  val hw = new HelloWorld4
  val hw2 = new HelloWorld2(3, 9)
  val hw3 = new HelloWorld3(6)

  val hm = new HumanDto(1, "Taro")
  println(hm.id + hm.name)
}

class HelloWorld4 {
  // コンストラクタの処理はクラス定義直下
  val value = "Hello world"
  println(value)
}

class HelloWorld2(x: Int, y: Int) {
  println(x + y)
}

class HelloWorld3(x: Int, y: Int) {
  println(x + y)

  def this(z: Int) = {
    this(z, 100)
    println("hojo")
  }
}

class HumanDto(val id: Int, val name: String) {

}