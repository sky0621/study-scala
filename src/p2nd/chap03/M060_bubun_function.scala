package p2nd.chap03

/**
  *  2016/01/27.
  */
object M060_bubun_function extends App {
  // 関数を部分的に定義できる「部分関数」（scala.PartialFunctionトレイト）

  // IllegalArgumentExceptionかIllegalStateExceptionの場合のみ値を返す
  val base: PartialFunction[Throwable, String] = {
    case _: IllegalArgumentException => "Parameter is invalid."
    case _: IllegalStateException => "State is invalid."
  }

  // 常に値を返す
  val ex: PartialFunction[Throwable, String] = {
    case _ => "No Support."
  }

  // baseのPartialFunctionを利用
  def check(i: Int) = {
    try {
      if(i<0) throw new IllegalArgumentException
      "success"
    } catch {
      base orElse ex
    }
  }

  println(check(2))
  println(check(-1))

  println(base.isDefinedAt(new IllegalArgumentException))
  println(base.isDefinedAt(new IndexOutOfBoundsException))
}
