package p2nd.chap01

/**
  *  2016/01/13.
  */
object M005 {
  def main(args: Array[String]): Unit = {
    val c0051 = new C005_1()
    c0051.hello5(c0051.strc0051)
    val c0052 = new C005_2()
    c0052.hello5(c0052.strc0052)
  }

}

class C005_1 {
  val strc0051: String = "C005_1"

  def hello5(par: String): Unit = println("Hello, C005_1." + par)
}

class C005_2 {
  val strc0052 = "C005_2"

  def hello5(par: String): Unit = {
    println("Hello, C005_2." + par)
  }
}