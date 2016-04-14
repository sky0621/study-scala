package p2nd.chap04

/**
  *  2016/02/10.
  */
object M084_companion extends App {
  val ob = M084DBAccess("dburl", "taro", "taropass")
}

class M084DBAccess private(url: String, user: String, password: String) {
  def show() = println("url: " + url + ", user: " + user + ", password: " + password)
}

object M084DBAccess {
  def apply(url: String, user: String, password: String) = {
    new M084DBAccess(url, user, password)
  }
}