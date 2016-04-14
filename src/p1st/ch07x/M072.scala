package p1st.ch07x

/**
  *  2016/01/07.
  */
object M072 {

  class M072clz {
    val v = "Hello M072!"
    println(v)

    def this(z: Int) = {
      this
      println("Hojo")
    }

    def printHello = println(v)
  }

  def main(args: Array[String]): Unit = {
    val m072clz = new M072clz
    m072clz.printHello
    val m072clz2 = new M072clz(3)
  }
}
