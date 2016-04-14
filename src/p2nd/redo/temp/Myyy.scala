package p2nd.redo.temp

/**
  *  2016/01/26.
  */
object Myyy {
  def main(args: Array[String]): Unit = {
    val ary = Array("A","B","O","AB")
    ary.foreach( b => println(b) )

    println("-----")

    val exp = """\d{3}-\d{4}"""
    val str: String = "383-9212"
    println(str.matches(exp))

    val opt: Option[String] = Option(null)
    println(opt.getOrElse("Else"))

    val fn: Int => Int = _ % 2
    println(fn(3))
  }
}
