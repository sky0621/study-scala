package p2nd.chap03

/**
  *  2016/01/25.
  */
object M053_functiion extends App {

  // 式が１つのときはワンライナー
  // 引数の型が推論可能なので省略
  // 引数１つなので（）も省略
  // 引数の使用が１回だけなのでプレースホルダー使用可能
  val f: Int => Int = _ * 2
  println(f(234))

  // 複数の引数もプレースホルダー使用可能
  val f2 = (_: Int) * (_: Int)
  println(f2(3, 4))

  // 引数なしの場合
  val f3 = () => println("f3")
  f3()

  println("----------------")
  //
  // 関数を引数として渡す
  // ※呼び出すたびにアルゴリズムを変えられる
  //
  def execu(add: (Int, Int) => Int) = add(3, 4)
  println(execu((d, b) => d + b))
  println(execu((d, b) => d * b))

  println("----------------")
  //
  // 関数を戻り値として返す
  //
  // Intを渡して２倍したIntを返す関数
  // 戻り値省略
  // プレースホルダー使用可能
  def double: Int => Int = _ * 2
  println(double(5))

}
