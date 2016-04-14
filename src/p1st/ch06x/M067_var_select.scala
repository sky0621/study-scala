package p1st.ch06x

/**
  *  2016/01/03.
  */
object M067_var_select {
  def main(args: Array[String]): Unit = {

    def tax(total: Int, rate: BigDecimal, discount: Int) = (total - discount) * rate
    println(tax(rate = BigDecimal(0.03), total = 30000, discount = 5000))
  }
}
