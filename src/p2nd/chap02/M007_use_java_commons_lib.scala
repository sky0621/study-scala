package p2nd.chap02

import java.io.InputStream
import java.net.URL

import org.apache.commons.io.IOUtils

/**
  *  2016/01/13.
  */
object M007_use_java_commons_lib extends App{
  println("M007")

  val inst: InputStream = new URL("http://www.sleipnirstart.com/").openStream()
  try {
    println(IOUtils.toString(inst))
  }finally{
    IOUtils.closeQuietly(inst)
  }
}
