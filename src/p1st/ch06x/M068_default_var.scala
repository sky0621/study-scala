package p1st.ch06x

/**
  *  2016/01/03.
  */
object M068_default_var {
  def main(args: Array[String]): Unit = {
    def price(total: Int, discount: Int = 500) = total - discount
    println(price(1000))
    println(price(1000, 300))
  }
}
