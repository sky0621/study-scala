package p2nd.chap04

/**
  *  2016/02/10.
  */
object M082_lazy extends App {
  val c = new M082ClassSample
  // まずトレイトから実行するので fld は null になる
  println(c.hello)

  val c2 = new M082ClassSample2
  println(c2.hello)
}

trait M082TraitSample {
  // 抽象フィールド
  val fld: String

  // 抽象フィールドを使用
  val hello = "Hello, " + fld
}

class M082ClassSample extends M082TraitSample {
  override val fld: String = "Scala!"
}

trait M082TraitSample2 {
  val fld: String

  // lazyにより遅延評価
  lazy val hello = "Hello, " + fld
}

class M082ClassSample2 extends M082TraitSample2 {
  override val fld: String = "Scala2!"
}