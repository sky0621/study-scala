package p2nd.chap05

/**
  *  2016/03/17.
  */
object M109_List_add extends App {

  val list = List("A", "H", "Z")

  val nList = list :+ "9"
  println(nList)

  val n2List = "0" :+ list
  println(n2List)

  val n3List = "0" +: list
  println(n3List)

  val l = "a" :: "b" :: "c" :: Nil
  println(l)

  val l2 = l ::: "9" :: Nil
  println(l2)

  val l3 = "0" :: l
  println(l3)

}
