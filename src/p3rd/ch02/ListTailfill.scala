package p3rd.ch02

/**
  * 2016/04/16.
  */
object ListTailfill {
  // 暗黙の型変換メソッド
  implicit def listTailfill[A](list: List[A]) = new {
    // バグってる？
    def tailfill(min: Int) = {
      if(min <= list.size) list.tail
      else list.tail ::: List.fill(min - list.size)(null)
    }
  }
}
