package p2nd.redo.temp

/**
  *  2016/02/07.
  */
object Lll extends App {

  val inst = new Player
  val situ = new Situation
  situ.situa("a", "b", "cd", "e")
  val effe: Effect = inst.play(situ)
  effe.res

  println(inst.isSuper(true))

}

class Player {
  var number: Int = 0
  def play(situation: Situation): Effect = {
    new Effect
  }

  def isSuper(sup: Boolean = false): Boolean = {
    if(System.getProperty("super") == null) true else false
  }

}

class Situation {
  def situa(args: String*): Unit = println(args.length)
}

class Effect {
  def res = println("Effect!")
}
