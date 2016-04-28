package p3rd.work

/**
  * 2016/04/29.
  */
object Work {
  def main(args: Array[String]): Unit = {
    fib(1, 0, 100)
  }

  def fib(now: Int, pre: Int, end: Int): Unit = {
    if(now > end) println(now)
    else {
      println(now)
      fib(now + pre, now, end)
    }
  }
}
