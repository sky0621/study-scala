package a

import java.io.InputStream
import java.net.URL

import org.apache.commons.io.IOUtils

/**
  *  2016/03/09.
  */
object M007 {

  def main(args: Array[String]): Unit = {
    val strm: InputStream = new URL("http://www.amazon.co.jp/").openStream()
    try {
      println(IOUtils.toString(strm))
    }finally{
      IOUtils.closeQuietly(strm)
    }
  }
}
