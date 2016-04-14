package p2nd.chap02

/**
  *  2016/01/20.
  */
object M032_regex_search extends App {
  val regex = """\d{3}""".r
  val source = "123 to 456"
  regex.findAllIn(source).foreach { s: String => println(s) }
}
