package p3rd.ch03

/**
  * 2016/04/28.
  */
object M056_nested_function {

  def main(args: Array[String]): Unit = {
    list("Tokyo")
    list("Kanagawa")
    list("Shibuya")
  }

  def list(capital: String) = {
    def isTokyo(address: String) = address contains capital

    println(isTokyo("Shibuya, Shibuya-ku, Tokyo"))
  }
}
