package p3rd.ch03

/**
  * 2016/04/21.
  */
object M053toXXX_function extends App {
  val f = (x: Int, y: Int) => x + y
  println(f(3, 4))

  val f2: (Int, Int) => Int = (x, y) => x * y
  println(f2(3, 4))

  val f3: Int => Int = x => x * 10
  println(f3(5))

  val f4: Int => Int = _ / 2
  println(f4(32))

  val f5: (Int, Int) => Int = _ - _
  println(f5(9, 4))

  val f6 = () => println("Hello!")
  f6()
}
