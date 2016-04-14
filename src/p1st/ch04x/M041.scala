package p1st.ch04x

/**
  *  2015/12/23.
  */
object M041 {

  def main(args: Array[String]): Unit = {

    val len: Int = getLength(Array("abcde", ""))
    println(len)
  }

  def getLength(value: AnyRef): Int =
  value match {
    case x: String => x.length
    case x: Array[_] => x.length
    case x: Iterable[_] => x.size
    case _ => throw new IllegalArgumentException
  }
}
