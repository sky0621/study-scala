package p3rd.ch02

import java.io.FileInputStream

/**
  * 2016/04/21.
  */
object M050toXXX_option_either {
  def main(args: Array[String]): Unit = {
    // Option
    val opt: Option[String] = Option("Test")
    println(opt)
    println(opt.get)
    println(opt.isDefined)
    println(opt.isEmpty)
    val opt2: Option[String] = Option(null)
    println(opt2)
    println(opt2.getOrElse("no one"))
    println(opt2.isDefined)
    println(opt2.isEmpty)

    println("-------------------------------")

    // try/catch
    val in = new FileInputStream("C:\\FHS\\dummy.txt")
    val content = try {
      in.read(new Array[Byte](in.available()))
    } catch {
      case e => e.toString
    } finally {
      in.close()
    }
    println(content)

    println("-------------------------------")

    // Either
    val right = readFile("C:\\FHS\\dummy.txt")
    println(right)
    val left = readFile("C:\\FHS\\dummy2.txt")
    println(left)
  }

  def readFile(fname: String): Either[Throwable, String] = {
    val in = new FileInputStream(fname)
    try {
      val buf = new Array[Byte](in.available())
      in.read(buf)
      Right(new String(buf, "UTF-8"))
    } catch {
      case e => Left(e)
    } finally {
      in.close()
    }
  }
}
