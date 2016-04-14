package p2nd.chap04

/**
  *  2016/02/07.
  */
object M077_override extends App {
  val p = new Parent
  val c = new Child

  println(p.greet)
  println(c.greet)

}

class Parent {
  val id = 1
  def greet = "My name is Parent."
}

class Child extends Parent {
  override val id = 2
  override def greet = "My name is Child."
}
