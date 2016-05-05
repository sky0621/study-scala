package p2nd.chap04

/**
  *  2016/02/10.
  */
object M084_companion extends App {
  // 同じ名前のクラスとシングルトンを１ファイルに定義すると、シングルトンはコンパニオンオブジェクトになる。
  // クラスとコンパニオンオブジェクトは互いのプライベートメンバーにアクセス可能なので、クラスのファクトリーとして使われることが多い。
  // ファクトリーメソッドは apply メソッドに定義する。

  val ob = M084DBAccess("dburl", "taro", "taropass")
  ob.show()
}

class M084DBAccess private(url: String, user: String, password: String) {
  def show() = println("url: " + url + ", user: " + user + ", password: " + password)
}

// シングルトン
object M084DBAccess {
  def apply(url: String, user: String, password: String) = {
    new M084DBAccess(url, user, password)
  }
}