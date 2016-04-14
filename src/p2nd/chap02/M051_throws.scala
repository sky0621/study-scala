package p2nd.chap02

import java.io.{FileInputStream, FileNotFoundException, IOException}

/**
  *  2016/01/25.
  */
object M051_throws extends App{
  // try/catch/finally構文
  // catchではパターンマッチ使用可能
  // チェック例外がないのでtry/catchが必須ではない
  // try/catchは式のため、値を返すことも可能

  val in = new FileInputStream("C:\\Users\\Shotaro.S\\IdeaProjects\\ScalaRecipe2\\src\\p2nd\\chap02\\memo.txt")
  val res = try {
    val buf = new Array[Byte](in.available())
    in.read(buf)
    println(new String(buf, "UTF-8"))
    "eNd"
  } catch {
    case e: IOException => println("IOException!")
    case e: FileNotFoundException => println("File not found.")
//    case e => e.printStackTrace()
  } finally {
    in.close()
  }

  println("---------------------------------------")
  println(res)
}
