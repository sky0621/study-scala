package p2nd.chap04

/**
  *  2016/02/10.
  */
object M089_generics extends App {
  val g = new M089Gen[String]
  g.hello("Siro")
}

class M089Gen[A] {
  def hello[A](str: A) = println("Hello, " + str)
}
