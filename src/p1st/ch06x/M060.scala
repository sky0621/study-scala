package p1st.ch06x

/**
  *  2015/12/30.
  */
object M060 {

  def main(args: Array[String]): Unit = {

    println(check(-1))

    println(check2(2))
  }

  val base: PartialFunction[Throwable, String] = {

    case _: IllegalArgumentException => "Parameter is invalid."
    case _: IllegalStateException => "State is invalid."
  }

  val ex: PartialFunction[Throwable, String] = {

    case _ => "No support."
  }

  def check(i: Int) = {
    try {
      if (i < 0) throw new IllegalArgumentException
      "success"
    } catch base
  }

  def check2(i: Int) = {
    try {
      i / 0
      "success"
    } catch base orElse ex
  }

}
