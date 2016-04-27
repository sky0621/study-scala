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

  // M054
  def exec(f: Int => Boolean) = f(10)
  val sf: Int => Boolean = _ > 5
  println(exec(sf))

  // M055
  def double: Int => Int = {
    i: Int => i * 2
  }
  var fd = double
  println(fd(12))

  def double2 = (i: Int) => i * 2
  var fd2 = double2
  println(fd2(13))

  def double3: Int => Int = _ * 2
  var fd3 = double3
  println(fd3(14))

}
