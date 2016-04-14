package p1st

/**
  *  2015/12/30.
  */
object M058 {

  def main(args: Array[String]): Unit = {

    // Intを渡してStringを返す関数型の定数 func に price メソッドを代入
//    val func: Int => String = price

    // Intを渡してStringを返す関数を引数に受け取って、その関数に1000を渡した結果をprintlnするメソッドを定義
    def printPrice(func: Int => String) = println(func(1000))

    // priceメソッドを引数に渡してprintPriceメソッドを実行！
    printPrice(price)

    def printPrice2(func: Int => String, price: Int) = println(func(price))
    printPrice2(price, 50)

    println(price(100))

    val ff = price _
    println(ff(200))

    printPrice(ff)
  }

  // メソッドを定義
  def price(p: Int) = "金額：" + p

}
