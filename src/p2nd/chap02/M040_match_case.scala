package p2nd.chap02

/**
  *  2016/01/20.
  */
object M040_match_case extends App {
  val str: String = "Python"

  val res: String = str match {
    case "C" | "Java" | "Scala" | "C#" => "コンパイル言語"
    case "PHP" | "Ruby" | "JavaScript" | "Python" => "スクリプト言語"
    case _ => "その他"
  }

  println(res)
}
