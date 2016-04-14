package p2nd.chap04

/**
  *  2016/02/04.
  */
object M069_implicit_parameter extends App {
  implicit val vat = new VAT(5)
  implicit val gst = new GST(10)

  val t = new Tax
  t.calc(3)
}

class VAT(val rate: Int)
class GST(val rate: Int)

class Tax {
  def calc(total: Int)(implicit vat: VAT, gst: GST) = {
    println("VAT:" + total * (vat.rate * 0.01))
    println("GST:" + total * (gst.rate * 0.01))
  }
}