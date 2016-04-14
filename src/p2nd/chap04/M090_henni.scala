package p2nd.chap04

/**
  *  2016/02/17.
  */
object M090_henni extends App {
  // 型パラメータ
  // [A] = 非変 ... 通常のJavaジェネリクス。指定した型のみ代入可。
  // [+A] = 共変 ... Javaの<? extends SuperClass>と同じ。指定した型かサブクラスを代入可。
  // [-A] = 反変 ... Javaの<? super MyClass>と同じ。指定した型かスーパークラスを代入可。

  val nv: NonVariant[String] = new NonVariant[String]
//  println(nv.get)
  nv.put("niko")

  val sbv: SubVariant[AnyRef] = new SubVariant[String]

  val spv: SuperVariant[Int] = new SuperVariant[AnyVal]
}

class NonVariant[A] {
//  def get: A = "getget"
  def put(arg: A) = println(arg)
}

class SubVariant[+A]

class SuperVariant[-A]
