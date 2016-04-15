package p3rd.ch02

/**
  * 2016/04/16.
  */
object M000 {
  def main(args: Array[String]): Unit = {
    println("Hello!")

    val no = 345
    val str = "test"

    println(no)
    println(str)

    val i = show(5)
    val s = show(-5)
    println(i)
    println(i.getClass)
    println(s)
    println(s.getClass)
  }

  def show(v: Int) = {
    if(v > 0) v
    else "マイナス"
  }
}
