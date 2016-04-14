package p2nd.chap02

/**
  *  2016/01/20.
  */
object M047_match_if extends App {
  def ptnGuard(tuple: (Any, Any)) = {
    tuple match {
      case (x, y) if x == y => println("%sと%sが同じ".format(x, y))
      case _ => println("その他")
    }
  }

  ptnGuard((3, 3))
}
