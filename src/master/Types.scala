package master

/**
  * Created by Shotaro.S on 2016/05/05.
  */
object Types {
  def main(args: Array[String]): Unit = {

    // Any: すべての型の親
    val vlAny: Any = "Any"
    println(vlAny)

    // AnyRef: すべての”参照”型の親
    val vlAnyRef: AnyRef = "AnyRef"
    println(vlAnyRef)

    // AnyVal: すべての”プリミティブ”型の親
    val vlAnyVal: AnyVal = 12345
    println(vlAnyVal)

    // Nothing: Anyの対義　※Abstractなのでインスタンス生成不可
//    val vlNothing: Nothing = new Nothing
//    println(vlNothing)

    // Null: AnyRefの対義
    val vlNull: Null = null
    println(vlNull)

    // Unit < AnyVal: voidのようなもの
    val vlUnit: Unit = null
    println(vlUnit)

    // Int < AnyVal: 自然数（サイズ別に Short, Long がある）
    val vlInt: Int = 44563
    println(vlInt)

    // Byte < AnyVal: byte
    val vlByte: Byte = 1
    println(vlByte)

    // Char < AnyVal: char
    val vlChar: Char = 'A'
    println(vlChar)

    // Boolean < AnyVal: true/false
    val vlBoolean: Boolean = true
    println(vlBoolean)

    // Float < AnyVal: 浮動小数点数（サイズ別に Double がある）
    val vlFloat: Float = 3.14f
    println(vlFloat)

  }
}
