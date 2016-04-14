package p1st.ch07x

/**
  *  2016/01/07.
  */
object M070 {

  def main(args: Array[String]): Unit = {
    hello(true, println("Hello"))
    hello(false, println("Holle"))

    println("------------------")

    hello2(true, println("2 Hello"))
    hello2(false, println("2 Holle"))
  }

  def hello(isExec: Boolean, f: => Unit) =
    if(isExec) f

  def hello2(isExec: Boolean, f: Unit) =
    if(isExec) f

}
