package p2nd.redo.temp

/**
  *  2016/02/25.
  */
object Rxx extends App {
  println(3 + 4)

  val ani = new Rxx_Animal
  println(ani.cry(true))
  println(ani.cry(false))
  println(ani.cry(true, "メー"))

  val oth = new {
    val name: String = "NaMeeeeee"
    def obbbb(str: String): Unit = println("Obbbb... " + str)
  }

  oth.obbbb("Waaaaai")
  println(oth.name)

  ani.cry2("ワン", "ニャー", "チュー")

  implicit val vo: String = "いんぷりしっと！"

  ani.cry3
  ani.cry3("インプリシット！")

  val add = new Rxx_Adder(12, 3)

  val ani2 = new Rxx_Animal("Dog")
}

class Rxx_Animal {
  var id: Int = 0

  // コンストラクタ
  println("コンストラクタ起動！！")

  def this(name: String) = {
    this()
    println(name)
  }
  def cry(isCry: Boolean, voice: String = "ムォー"): String = {
    if(isCry) voice
    else "[し～ん]"
  }
  def cry2(voice: String*): Unit = {
    for(v: String <- voice) {
      println(v)
    }
  }
  def cry3(implicit vo: String): Unit = {
    println(vo)
  }
  class Rxx_Inner {
    var id: Int = 1
  }

}

final class Rxx_Cat extends Rxx_Animal {

}

class Rxx_Adder(val x: Int, val y: Int) {
  println(x + y)

//  def this(x: Int, y: Int, isAdd: Boolean): Unit = {
//    if(isAdd) println(x + y)
//    else println(x - y)
//  }
}