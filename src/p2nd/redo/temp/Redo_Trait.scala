package p2nd.redo.temp

/**
  *  2016/02/11.
  */
object Redo_Trait extends App {
  val cs = new ClassSample with TraitImpl
  cs.handle()
}

trait TraitSample {
  val v: String
  def handle()
}

trait TraitImpl extends TraitSample {
  abstract override def handle(): Unit = {
    println("start")

    super.handle()

    println("end")
  }
}

class ClassSample extends TraitSample {
  override val v: String = "ClassSample"

  override def handle(): Unit = println("handle ClassSample")
}