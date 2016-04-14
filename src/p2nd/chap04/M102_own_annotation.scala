package p2nd.chap04

/**
  *  2016/02/25.
  */
object M102_own_annotation extends App {


}

@SerialVersionUID(1L)
class M102_Class[@specialized T] {
  val x: Int @check = 0

  val y: Int = 2
}

// @check
class check extends annotation.Annotation

// @check(123L)
class check2(id: Long) extends annotation.StaticAnnotation
