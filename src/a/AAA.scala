package a

/**
  *  2016/03/10.
  */
object AAA extends App {

  def price(v: Int) = "Val:"+ v

  val f1: String = price(100)
  println(f1)

  val f2 = price _
  println(f2)
  println(f2(50))
}
