package p3rd.ch02

/**
  * 2016/04/20.
  */
object M034toXXX_if_for {
  def main(args: Array[String]): Unit = {
    val prm = 4
    val res = if(prm % 2 == 0) {
      "偶数"
    } else if(prm % 2 == 1) {
      "奇数"
    } else {
      prm
    }
    println(res)

    val lst = List(3, 4, 5, 6, 7, 8, 9, 10, 11)
    val forRst = for(i <- lst if i % 2 == 0) yield {
      i * 10
    }
    println(forRst)
  }
}
