package a

/**
  *  2016/03/10.
  */
object M026 {

  def main(args: Array[String]): Unit = {
    val src: String = "ABC\ndef\nGHI\njkl"
    src.lines.foreach { line: String => println(line) }
  }
}
