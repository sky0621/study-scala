package p1st.ch06x

/**
  *  2015/12/30.
  */
object M062 {

  def main(args: Array[String]): Unit = {

    val greetFunc = (title: String, name: String) => title + name

    // カリー化により、(title: String) => (name: String) => title + name になった。
    val curryFunc = greetFunc.curried

    println(curryFunc("HeloHelo")("Umeko"))
    val cu = curryFunc("Helo2")
    println(cu("Jo"))

    def greetDef(title: String, name: String) = title + name

    // カリー化により、(title: String) => (name: String) => title + name になった。
    val curryDef = (greetDef _).curried

    println(curryDef("Hi")("Koichi"))
    val cd = curryDef("HiHi")
    println(cd("Neko."))
  }

}
