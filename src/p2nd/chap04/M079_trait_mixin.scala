package p2nd.chap04

/**
  *  2016/02/08.
  */
object M079_trait_mixin extends App {

  val sample = new M079TraitString {
    override def string: String = "newTraitString"
  }
  println("--- new M079TraitStrin ---")
  println(sample.string)

  val sample2 = new M079TraitPrint with M079TraitString {
    override def string: String = "newTraitPrintWithTraitString"
  }
  println("--- new M079TraitPrint with M079TraitString ---")
  println(sample2.string)
  sample2.print()

  val sample3 = new M079ClassSample with M079TraitPrint
  println("--- new M079ClassSample with M079TraitPrint ---")
  sample3.print()
}

trait MyTraitM079 {
  val v: String = "MyTrait.v"
  def name = "MyTrait"
}

trait MyTrait2M079 {
  val v2: Int
  def name2 = "MyTrait2"
}

class MyClassM079 extends MyTraitM079 with MyTrait2M079{
  override val v2: Int = 1

}

trait M079TraitString {
  def string: String
}

trait M079TraitPrint {
  def print() = println("M079TraitPrint")
}

class M079ClassSample{

}
