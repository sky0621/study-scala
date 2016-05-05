package p3rd.work

/**
  * 2016/04/29.
  */
object Work2 {
  def main(args: Array[String]): Unit = {
    val ot = new Outer
    ot.show("TEST")
    val in = new ot.Inner
    in.show("DEST")

    var ot2: Outer = null
    ot2 = new Outer
    ot2.show("ABC")

    var in2: Outer#Inner = null
    in2 = new ot.Inner
    in2.show("XYZ")
  }
}

class Outer {
  def show(str: String): Unit = {
    println("Outer." + str)
  }

  class Inner {
    def show(str: String): Unit = {
      println("Inner." + str)
    }
  }
}