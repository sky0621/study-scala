package p2nd.chap04

/**
  *  2016/02/10.
  */
object M086_enumeration extends App {
  println(Sex.Man)
  println(Sex.Woman)
  println(Sex.values)
}

object Sex extends Enumeration {
  type Sex = Value
  val Man, Woman = Value
}
