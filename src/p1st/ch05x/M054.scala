package p1st

/**
  *  2015/12/29.
  */
object M054 {

  def main(args: Array[String]): Unit = {

    exe(i => i%2==0)
  }

  def exe(f: Int => Boolean) = f(10)

}
