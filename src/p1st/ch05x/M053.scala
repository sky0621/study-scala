package p1st

/**
  *  2015/12/29.
  */
object M053 {

  def main(args: Array[String]): Unit = {

    val f: Int => Int = i => i * 2
    println(f(5))

    val f2 = () => println("World!")
    f2()

    val f3: Int => Int = _ * 3
    println(f3(6))
  }

}
