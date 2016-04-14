package p2nd.chap02

/**
  *  2016/01/13.
  */
object M026_lines_foreach extends App {
  val src = "１行目\n２行目\n３行目\n４行目"

  src.lines.foreach{line: String => println(line)}

  src.linesWithSeparators.foreach{line: String => println(line)}

  src.split("\n").foreach{line: String => println(line)}

}
