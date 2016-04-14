package p2nd.redo.temp

/**
  *  2016/02/11.
  */
object Redo_Generics extends App {
  val gs = new GenSample[String]
  gs.handle("GenGenGen")
}

class GenSample[A] {
  def handle[A](n: A): Unit = println(n)
}