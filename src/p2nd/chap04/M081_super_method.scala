package p2nd.chap04

/**
  *  2016/02/10.
  */
object M081_super_method extends App {
  val t = new M081MainClass
  t.print()
}

class M081SuperClass {
  def print() = println("SuperClass!")
}

trait M081TraitSample {
  def print() = println("TraitSample!")
}

class M081MainClass extends M081SuperClass with M081TraitSample {
  override def print() = {
    super.print()
    super[M081TraitSample].print()
    super[M081SuperClass].print()
  }
}