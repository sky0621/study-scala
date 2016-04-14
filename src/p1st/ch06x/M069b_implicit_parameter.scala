package p1st.ch06x

/**
  *  2016/01/04.
  */
object M069b_implicit_parameter {
  implicit object VAT extends Tax2 {
    def rate: Int = 5
  }

  def main(args: Array[String]): Unit = {
    val c = new Calculation
    println(c.tax)
  }
}

trait Tax2 {
  def rate: Int
}

class Calculation {
  def tax(implicit tax: Tax2) = tax.rate * 0.01
}
