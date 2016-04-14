package p1st.ch06x

/**
  *  2016/01/03.
  */
object M069_implicit_parameter {
  def main(args: Array[String]): Unit = {
    println((new VAT()).calc)
  }
}

class Tax {
  def tax(implicit rate: Int) = rate * 0.01
}

class VAT {
  implicit val rate = 3

  def calc = {
    val tax = new Tax
    tax.tax     // => 0.05
//    tax.tax(10) // => 0.1
  }
}