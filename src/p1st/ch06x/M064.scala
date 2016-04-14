package p1st.ch06x

/**
  *  2016/01/03.
  */
object M064 {

  def main(args: Array[String]): Unit = {
    val outer1 = new M064Class
    println(outer1.outerVal)

    var inner1: M064Class#M064Inner = new outer1.M064Inner
    println(inner1.innerPubVal)

    val nonameIns = new {
      val outVal = "outVal"
      def talk(who: String): Unit = {
        println("talk to " + who)
      }
    }

    nonameIns.talk("Taro")
    println(nonameIns.outVal)
  }
}
