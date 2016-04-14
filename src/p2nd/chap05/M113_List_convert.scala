package p2nd.chap05

/**
  *  2016/03/24.
  */
object M113_List_convert {
  def main(args: Array[String]): Unit = {
    println("【要素の文字数でソートなど】")
    val list = List("JavaScript", "Go", "Ruby", "C++", "Scala", "Closure", "C", "Java8")
    val res = list.map { _.length }
    println(res)

    val res2 = res.collect { case num if num > 3 => num * 3 }
    println(res2)

    val sorted = res.sorted
    println(sorted)
    println(sorted.reverse)

    println(" ")
    println("【任意の方法でソート】")

    val swList: List[String] = list.sortWith {
      (pg1, pg2) => pg1.length < pg2.length
    }
    println(swList)

    println(" ")
    println("【要素を文字列に変換】")

    println(list.toString())
    println(list.mkString)
    println(list.mkString(":"))
    println(list.mkString("[PRE]", "...", "<suffix>"))

    println(" ")
    println("【ケースクラスを用いて要素比較】")

    val jiro: Book = new Book(2, "Jiro")
    val taro: Book = new Book(1, "Taro")
    val hana: Book = new Book(3, "Hana")

    val bkList: List[Book] = List[Book](jiro, taro, hana)
    bkList.foreach( bk => println(bk) )

    println(jiro > taro)
    println(taro > jiro)
  }
}

case class Book(id: Int, name: String) extends scala.math.Ordered[Book] {
  override def compare(that: Book): Int = {
    id.compare(that.id)
  }
}