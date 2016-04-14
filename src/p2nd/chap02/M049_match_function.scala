package p2nd.chap02

/**
  *  2016/01/20.
  */
object M049_match_function extends App {
  val func: String => Unit = {
    case "Java" => print("J")
    case "Scala" => print("S")
    case _ => print("Z")
  }

  func("Scala")
}
