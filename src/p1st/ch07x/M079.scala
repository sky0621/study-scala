package p1st.ch07x

/**
  *  2016/01/07.
  */
object M079 {
  def main(args: Array[String]): Unit = {
    val tstr = new TraitString {
      override def string: String = "TraitString"
    }

    println(tstr.string)

    val tpri = new TraitPrint with TraitString {
      override def string: String = "TraitPrint + TraitString"
    }

    println(tpri.string)

    val sample = new ClassSample with TraitPrint

    sample.print()
  }
}

trait TraitString {
  def string: String
}

trait TraitPrint {
  def print() = println("TraitPrint")
}

class ClassSample {

}