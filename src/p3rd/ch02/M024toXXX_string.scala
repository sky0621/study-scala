package p3rd.ch02

/**
  * 2016/04/16.
  */
object M024toXXX_string {
  def main(args: Array[String]): Unit = {
    // M024:複数行コメント
    val str =
      """
         SELECT
             USER_ID,
             USER_NAME
         FROM
             USER
         WHERE
             USR_ID = '123'
      """.stripMargin
    println(str)

    // M025:文字列フォーマット
    println("Hello, %s!".format("Scala"))
    println("%2$sは%1$d文字以内で入力してください。".format(20, "氏名"))
    println("%04d/%02d/%02d".format(990, 4, 3))
    println("%08.3f".format(123.03d))

    // M026:改行コードによる文字列分割
    val src = "１行目\n２行目\n３行目"
    src.lines.foreach { println }
//    src.lines.foreach { line: String => println(line) }
    src.linesWithSeparators.foreach { println }

    // M027:文字列連結
    val sb = new StringBuilder
    sb.append("This").append(" is ").append(100).append(" books.")
    println(sb.toString())

    // M028:文字列比較
    val base = "比較元"
    val comp = "比較先"
    val same = "比較元"
    println(base == comp)
    println(base == same)
    println(base != comp)
    println(base != same)
    println(base.compareTo(comp))
    println(base.compareTo(same))

    // M029:文字列を別の型に変換
    val i: Int = "345".toInt
    println(i)
    val l: Double = "27.03".toDouble
    println(l)

    // M030:正規表現
    val postCode = """^\d{3}-\d{4}$"""
    println("123-4567".matches(postCode))
    println("123-45678".matches(postCode))
    println("1234567".matches(postCode))
  }
}
