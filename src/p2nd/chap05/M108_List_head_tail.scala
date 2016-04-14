package p2nd.chap05

/**
  *  2016/03/17.
  */
object M108_List_head_tail {

  def main(args: Array[String]): Unit = {

    val list = List("a", "b", "c", "d", "e")

    println(list.head)

    println(list.last)

    println(list.tail)

    println(list.tail.head)

    println(list.tail.last)

    println(list.tail.tail)

    val nonList = List()

    println(nonList.headOption)

//    println(nonList.tail)
  }
}
