package p1st.ch05x

import java.io.FileInputStream

/**
  *  2015/12/29.
  */
object M052_exception_right_left {

  def main(args: Array[String]): Unit = {

    val res: Either[Throwable, String] = readFile("C:\\Users\\Shotaro.S\\IdeaProjects\\ScalaRecipe2\\src\\ch05x\\cheet2.txt")
    res match {
      case Left(e) => e.printStackTrace()
      case Right(s) => println(s)
    }
  }

  def readFile(name: String): Either[Throwable, String] = {
    val in = new FileInputStream(name)
    try{
      val buf = new Array[Byte](in.available())
      in.read(buf)
      Right(new String(buf, "Shift_JIS"))
    }catch{
      case e => Left(e)
    }finally {
      in.close()
    }
  }

}
