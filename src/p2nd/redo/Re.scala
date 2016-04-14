package p2nd.redo

/**
  *  2016/03/18.
  */
object Re {
  def main(args: Array[String]): Unit = {
    val list = List("A", "B", "C", "D", "E")
    println(list.head)
    println(list.tail)
    println(list.last)

    val list2 = "a" :: "b" :: "c" :: "d" :: Nil
    list2.foreach { s => println(s) }
    println(list2(3))

    list.toArray.foreach { v => println(v.toLowerCase()) }

    println("-----")

    println(list.reverse)

    val listb = list :+ "Z"
    println(listb)

    val listc = "0" +: list
    println(listc)

    println("-----")

    val list3 = list.filter { _ != "C" }
    println(list3)

    val targets = List("B", "D", "E")
    val list4 = list.filterNot { targets.contains _ }
    println(list4)

  }
}
