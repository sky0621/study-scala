package p2nd.chap05

/**
  *  2016/03/17.
  */
object M110_List_filter {

  def main(args: Array[String]): Unit = {

//    val list = List("A" :: "B" :: "C" :: Nil)
    val list = List("A", "B", "C")
    println(list)

    val list2 = list.filter { _ != "B" }
    println(list2)

    val tList = List("A", "C")
    val list3 = list.filter { tList.contains _ } map { _.toLowerCase()}
    println(list3)
    val list4 = list.filterNot {  tList.contains _ }
    println(list4)

  }
}
