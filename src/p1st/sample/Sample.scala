package p1st.sample

/**
  *  2016/01/03.
  */
object Sample {
  def main(args: Array[String]): Unit = {
    val sc: SampleClass = new SampleClass
    sc.printHello
    println(sc.greet("Jiro"))
    sc.callPrivate
    println(sc.checkNo(0))
    println(sc.user)
  }
}
