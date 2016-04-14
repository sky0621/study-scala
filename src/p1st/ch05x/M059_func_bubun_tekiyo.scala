package p1st

/**
  *  2015/12/30.
  */
object M059_func_bubun_tekiyo {

  /*
   * 関数の部分適用（引数の一部に値を渡して、残りの引数を受け取って処理する新しい関数を生成すること）
   */
  def main(args: Array[String]): Unit = {

    def priceDiscount(total: Int, discount: Int) = total - discount
    println(priceDiscount(10000, 5000))

    val total500 = priceDiscount(500, _: Int)
    println(total500(50))

    val discount100 = priceDiscount(_: Int, 100)
    println(discount100(900))

    val redefPriceDiscount = priceDiscount _
    println(redefPriceDiscount(70, 7))

    val overridePriceDiscount = priceDiscount(333, 222)
    println(overridePriceDiscount)
  }

}
