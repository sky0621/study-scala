package p2nd.chap04

/**
  *  2016/02/17.
  */
object M097_type_alias extends App {
  // 型に別名をつける

  type M[A, B] = scala.collection.mutable.Map[A, B]
  type Two[A] = Tuple2[A, A]

  def printMap(map: M[Int, String]) = map.foreach { case (key, value) => println(key + "=" + value) }

  type MyString = String

  val ms: MyString = "Test"
  print(ms)
}
