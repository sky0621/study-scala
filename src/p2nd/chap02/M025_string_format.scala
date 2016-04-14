package p2nd.chap02

/**
  *  2016/01/13.
  */
object M025_string_format extends App {
  println("%2$sは%1$d文字以内で入力してください。".format(20, "お名前"))
  println("%04d/%02d/%02d".format(2016, 1, 13))
}
