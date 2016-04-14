package p1st.ch06x

/**
  *  2016/01/03.
  */
object M066_kahencho_var {
  def main(args: Array[String]): Unit = {

    def manyArgs(values: String*) = for(value <- values) println(value)

    manyArgs("ABC", "DEF", "GHI")
    manyArgs("123")

    val lst = List("X", "Y", "Z")
    manyArgs(lst: _*)
  }
}
