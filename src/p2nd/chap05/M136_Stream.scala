package p2nd.chap05

/**
  *  2016/03/24.
  */
object M136_Stream {
  def main(args: Array[String]): Unit = {

    // リストと同様の構造だが、遅延評価されるため、大量の要素を持つことが可能

    val stream = Stream("A", "B", "C")
    println(stream)
    stream.foreach { println }

    val stream2 = "A" #:: "B" #:: "C" #:: Stream.empty
    println(stream2)
    for(a <- stream2) println(a)
  }
}
