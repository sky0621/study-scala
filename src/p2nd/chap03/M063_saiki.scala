package p2nd.chap03

/**
  *  2016/01/28.
  */
object M063_saiki extends App {
  // ループ処理を再帰で行う場合、「末尾再帰」（処理の一番最後で自分自身を呼び出すこと）にすることが重要
  // 関数（メソッド）は、通常、呼び出すたびに新しいスタックフレームを生成するため、深い再帰ではスタックオーバーフロー発生の懸念がある
  // 末尾再帰にすると、単一のスタックフレームを使うよう最適化されるため、スタックオーバーフローが防げる

  def sum(summary: Int, target: List[Int]): Int = {
    if(target.isEmpty) summary
    else sum(summary + target.head, target.tail)
  }

  val l: List[Int] = List(1, 3, 5, 7, 9, 11)
  val res: Int = sum(0, l)
  println(res)

}
