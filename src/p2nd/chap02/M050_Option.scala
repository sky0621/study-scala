package p2nd.chap02

/**
  *  2016/01/20.
  */
object M050_Option extends App {
  // scala.Option
  //   |- Some
  //   |- None

  // 型で値の有無を判断

  val optStr: Option[String] = Option("test")
  println(optStr.get)

  val optNull: Option[String] = Option(null)
  println(optNull.orElse(Option[String]{"Alt"}))
  println(optNull.orNull)
  println(optNull.getOrElse("Nothing."))
}
