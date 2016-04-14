package p2nd.chap02

/**
  *  2016/01/20.
  */
object M036_for_if {
  def main(args: Array[String]): Unit = {
    for(i <- Range(2, 20)
        if(i > 8)
        if(i < 18)) println(i)
  }
}
