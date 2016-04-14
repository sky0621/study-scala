package p2nd.chap04

/**
  *  2016/02/25.
  */
object M098_my_annotation {
  def main(args: Array[String]): Unit = {
    val food = new M098_Food
    food.print
  }
}

class M098_Food {
  self =>
  val all = List("apple", "orange")

  def print = self.all foreach println
}

trait M098_SPhone extends M098_Lang with M098_OS {
  def special(str: String): Unit = println(str)
}

trait M098_Lang {
  case class M098_Java(kind: String)
  case class M098_Ruby(kind: String)
  case class M098_Go(kind: String)
}

trait M098_OS {
  self: M098_Lang =>
  object Android {
    val devLang = List(M098_Java)
  }
}
