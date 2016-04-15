package p3rd.ch02

import ListTailfill._

/**
  * 2016/04/16.
  */
object M020 extends App {
  val list = List("a", "b", "c")
  val list2 = list.tailfill(5)
  println(list2)
  println(list2.size)
}
