package p2nd.chap02

/**
  *  2016/01/13.
  */
object M024_multiline_comment extends App {
  val str =
    """
      |SELECT
      |  ID,
      |  NAME,
      |  AGE
      |FROM
      |  MAST_MEMBER
      |WHERE
      |  ID = 1
      |
    """.stripMargin

  println(str)
}
