package p2nd.redo.temp

/**
  *  2016/01/28.
  */
object Mzzz extends App {

  def compare(a: Int, b: Int) = { a - b }

  val compareTo1000 = compare(1000, _: Int)
  println(compareTo1000(300))

}
