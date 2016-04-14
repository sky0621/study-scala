package p1st

/**
  *  2015/12/30.
  */
object M057_closure {

  def main(args: Array[String]): Unit = {

    val mm = multi(30)
    println(mm(2))

    val mm2 = multi(50)
    println(mm2(2))

    val logReader = log("Reader")
    logReader("Start.")

    val logWriter = log("Writer")
    logWriter("Start.")

  }

  // multi関数生成時に外部の自由変数 times を受け取ってクロージャ生成
  def multi(times: Int) = (i: Int) => i * times

  def log(prefix: String) = (str: String) => println(prefix + " " + str)

}
