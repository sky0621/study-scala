package p2nd.chap05

import scala.collection.mutable._

/**
  *  2016/02/25.
  */
object M103_Collection extends App {
  // Traversable
  //   Iterable
  //     Seq
  //       IndexedSeq
  //         Vector
  //       LinearSeq
  //         List, Stream
  //       Buffer
  //         ListBuffer, ArrayBuffer
  //     Set
  //       SortedSet
  //         TreeSet
  //         HashSet
  //     Map
  //       SortedMap
  //         TreeMap
  //         HashMap

  val list: List[String] = List[String]("A", "B", "C")

  list foreach println

  var list2 = ListBuffer[String]()
  val pgs = Array[String]("Java", "Scala", "Go", "Ruby")
  pgs.foreach(pg => list2.append(pg))
  println(list2)
}
