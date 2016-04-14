package p2nd.chap04

/**
  *  2016/02/10.
  */
object M086_case_class extends App {
  val cc = new M086CaseClass(3, "Za")
  println(cc.id + cc.name)
  val ccc = cc.copy(4)
  println(ccc.id + ccc.name)
}

case class M086CaseClass(id: Int, name: String)
