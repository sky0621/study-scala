package p2nd.chap02

/**
  *  2016/01/20.
  */
object M030_regexp extends App{
  val ptn = """^\d{3}-\d{4}$"""

  println("244-0801".matches(ptn))
  println("2440801".matches(ptn))
}
