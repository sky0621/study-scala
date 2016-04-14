package p2nd.chap04

/**
  *  2016/02/04.
  */
object M076_abstract_class extends App {

  val im = new Impl
  println(im.va)
  println(im.abex("hoho"))
  im.abex2("haha")
}

abstract class Abst {
  // 抽象フィールド
  val va: String

  // 抽象メソッド
  def abex(arg: String): String
  def abex2(arg: String)
}

class Impl extends Abst {
  override val va: String = "va"
  override def abex(arg: String): String = "abex"
  override def abex2(arg: String): Unit = println("abex2")
}