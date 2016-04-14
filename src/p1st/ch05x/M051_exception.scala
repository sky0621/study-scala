package ch05x

import java.io.{IOException, FileInputStream}

/**
  *  2015/12/29.
  */
object M051_exception {

  def main(args: Array[String]): Unit = {

    val in = new FileInputStream("bl.txt")
    try {
      val buf = in.read()

    } catch {
      case e: IOException => e.printStackTrace()
    } finally {
      in.close()
    }
  }
}
