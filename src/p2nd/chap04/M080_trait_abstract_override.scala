package p2nd.chap04

/**
  *  2016/02/08.
  */
object M080_trait_abstract_override extends App {

  val o = new M080OutputConsole with M080DefaultExecutor
  o.handle()
}

trait M080Executor {
  // 抽象メソッド
  def handle()
}

trait M080DefaultExecutor extends M080Executor {
  abstract override def handle(): Unit = {
    println("start")

    super.handle()

    println("end")
  }
}

class M080OutputConsole extends M080Executor {
  // 抽象メソッド
  override def handle(): Unit = println("M080OutputConsole")
}
