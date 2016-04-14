package p2nd.chap05

/**
  *  2016/03/24.
  */
object M116_List_tail_ extends App {

  val list = List(3, 5, 7, 11, 13, 17, 19, 23, 29, 31)
  println(list)
  println("【先頭以外】" + list.tail)
  println("【先頭のみ】" + list.head)
  println("【3番目～8番目の手前】" + list.slice(3, 8))
  println("【先頭3つ分】" + list.take(3))
  println("【先頭5つ分を削った後】" + list.drop(5))
  println("【先頭～奇数のみ】" + list.takeWhile { n => n%2 != 0 })
  println("【末尾～偶数のみ】" + list.dropWhile { n => n%2 == 0 })

  println(" ")

  println(list.splitAt(5))
  println(list.span { _ < 10 })
  println(list.forall { _ % 2 != 0 })

  val list2 = List(List(1, 3, 5, 7), List(2, 4, 6, 8, 10))
  println(list2)
  println(list2.flatten.sorted.reverse)
}
