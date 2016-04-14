package p1st.ch06x

/**
  *  2015/12/30.
  */
object M061_func_curry {

  /*
   * カリー化（複数の引数がある関数を、１つの引数を持つ関数のチェーンに変換すること）
   */
  def main(args: Array[String]): Unit = {

    /*
     * 関数の場合
     */
    println(greetFunc("Hello")("World!"))

    val gf = greetFunc("Hello")
    println(gf("Hanako."))

    /*
     * メソッドの場合
     */
    println(greetDef("こんにちは")("世界"))

    val gd = greetDef("こんにちは")_
    println(gd("はなこ"))

    val list: List[String] = List("C", "Java", "Scala")
    val res = execu(list) {
      data => data.toString()
    }
    println(res)
  }

  // 最初にtitleを渡して次にnameを渡して、最終的にtitle+nameを返す
  val greetFunc = (title: String) => (name: String) => title + name

  def greetDef(title: String)(name: String) = title + name

  def execu(data: List[String])(f: List[String] => String) = {
    f(data)
  }

}
