package p2nd.redo.temp

/**
  *  2016/02/17.
  */
object Xxx {
  def main(args: Array[String]): Unit = {
    println("Hello")

    val xc = new XxxClass
    println(xc.xcDef())
    println(xc.xcDef(5))

    val src = "1line\n2line\n3line\n4line"
    src.lines.foreach(s => println(s))
    println(src.charAt(3))
    println(src.replaceAll("line", "LLL"))

    println("---------")
    val ifres = if(3>30) "True" else if(2==2) "TrUe" else "False"
    println(ifres)

    val lst = List(3, 5, 7, 9, 11)
    val forres = for(n <- lst) yield {
      n * 10
    }
    println(forres)
    forres.filter(n => n > 50).foreach(n => println(n))

    println("--------")
    val py = "Python"
    val resmt = py match {
      case "Java" | "Scala" => "JorS"
      case "Ruby" | "Python" => "RorP"
      case _ => "Other"
    }
    println(resmt)
  }
}

class XxxClass {
  val xcVal: String = "xcVal"

  def xcDef(i: Int = -1): Int = i * 3
}