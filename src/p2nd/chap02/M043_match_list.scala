package p2nd.chap02

/**
  *  2016/01/20.
  */
object                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                M043_match_list extends App {
  val l: List[Int] = List(3, 5, 7, 93, 7)

  val res: String = l match {
    case List(3, 5, 7, 9) => "ピンポイントマッチ"
    case List(_, _, _, _) => "要素数マッチ"
    case List(n, n2, _*) => "１つ目「%s」２つ目「%s」それ以外にマッチ".format(n, n2)
    case _ => "なんでもマッチ"
  }

  println(res)
}
