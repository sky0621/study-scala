package p2nd.chap02

/**
  *  2016/01/20.
  */
object M037_for_yield extends App{
  val forres = for(s <- List("A", "B", "C")) yield s.toLowerCase
  forres.foreach { f => println(f) }
}
