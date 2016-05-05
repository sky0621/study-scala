package master

/**
  * Created by Shotaro.S on 2016/05/05.
  */
object ImplicitDefine {

  // 暗黙の型変換: 異なる型の変数に代入する際に、ここで定義してあった変換用の関数が暗黙的に呼ばれる！
  implicit def convertToString(i: Int): String = {
    if(i > 0) "+"
    else "-"
  }

  def main(args: Array[String]): Unit = {
    val i1: Int = 1
    val i2: Int = 0

    val s1: String = i1
    val s2: String = i2

    println(i1)
    println(s1)
    println(i2)
    println(s2)
  }

}
