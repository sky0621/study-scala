package p2nd.chap02

import java.io.FileInputStream

/**
  *  2016/01/25.
  */
object M052_Either extends App {
  // 型パラメータで指定した２つの型のうち、どちらかを持てるコンテナ

  def readFile(filename: String): Either[Throwable, String] = {
    val in = new FileInputStream(filename)
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

  val res: Either[Throwable, String] = readFile("C:\\FHS\\usr\\local\\a.txt")
  res match {
    case Left(e) => println("Excep")
    case Right(str) => println(str)
  }

}
