package p2nd.chap04

/**
  *  2016/02/10.
  */
object M085_unapply extends App {
  // applyによって、各種パラメータを渡してオブジェクトを生成
  // unapplyによって、オブジェクトから各種パラメータを抽出

  // コンパニオンオブジェクトのファクトリが適用され、bookオブジェクト生成
  val book: M085Book = M085Book("タイトル", "著者", "出版社", 3850)

  // bookオブジェクトから抽出メソッドを使って各種パラメータを抽出
  val M085Book(t, a, p, pr) = book

  println(t)
  println(a)
  println(p)
  println(pr)
}

// privateな本クラス
class M085Book private(val title: String, val author: String, val publisher: String, val price: Int)

// 本クラスのコンパニオンオブジェクト
object M085Book {
  // ファクトリ
  def apply(title: String, author: String, publisher: String, price: Int): M085Book = {
    new M085Book(title, author, publisher, price)
  }

  // 抽出メソッド
  def unapply(book: M085Book): Option[(String, String, String, Int)] = {
    Some(book.title, book.author, book.publisher, book.price)
  }
}

// ------------------------------
// 可変長メンバーを持つ場合
// ------------------------------

class M085Authors private(val names: String*)

object M085Authors {
  def apply(names: String*): M085Authors = new M085Authors(names: _*)
  def unapplySeq(authors: M085Authors): Option[List[String]] = {
    Some(authors.names.toList)
  }
}
