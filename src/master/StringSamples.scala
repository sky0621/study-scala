package master

/**
  * Created by Shotaro.S on 2016/05/05.
  */
object StringSamples extends App {

  // マルチライン文字列
  val multiLine =
    """
      |SELECT
      |  USER_ID,
      |  USER_NAME
      |FROM
      |  USER_TABLE
      |WHERE
      |  USER_NAME LIKE '%$${userName}%'
    """.stripMargin
  println(multiLine)

  println("---------------------------------------------------")

  // フォーマット
  val msg: String = "This is a %s!"
  println(msg.format("message"))
  val msg2: String = "%s has %d holidays."
  println(msg2.format("June", 0))
  val msg3: String = "User %2$s has %1$d yen."
  println(msg3.format(10000, "Yukichi"))
  val ymd: String = "%04d-%02d-%02d"
  println(ymd.format(2016, 5, 5))

  println("---------------------------------------------------")

  // 改行文字などで分割
  val src = "１行目\n２行目\n３行目\n"
  src.lines.foreach { println }

}
