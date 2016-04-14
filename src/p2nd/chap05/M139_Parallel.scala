package p2nd.chap05

/**
  *  2016/03/24.
  */
object M139_Parallel extends App {

  val range: Range = 1 to 5
  println(range)

  val res = range.map { _ + 1 }
  println(res)
  val resb = res.reduceLeft { _ + _ }
  println(resb)

  val res2 = range.par.map { _ + 1 }
  println(res2)
  val res2b = res2.reduceLeft { _ + _ }
  println(res2b)
}
