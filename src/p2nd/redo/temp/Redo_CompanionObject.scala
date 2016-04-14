package p2nd.redo.temp

/**
  *  2016/02/11.
  */
object Redo_CompanionObject extends App {
  val cc = CompObj(1, "test")
  cc.handle()

  val CompObj(i, n) = cc
  println(i)
  println(n)
}

class CompObj private(val id: Int, val name: String) {
  def handle(): Unit = println("id: " + id + ", name: " + name)
}

object CompObj {
  def apply(id: Int, name: String) = new CompObj(id, name)

  def unapply(o: CompObj): Option[(Int, String)] = Some(o.id, o.name)
}
