package p1st.ch04x

/**
  *  2015/12/23.
  */
object M040_match_case {

  def main(args: Array[String]): Unit = {

    val lang: String = "Ruby"

    lang match {
      case "C" | "C++" | "C#" => {
        println("C's")
      }
      case "Java" | "JavaScript" => {
        println("J's")
      }
      case x => {
        println(x)
      }
    }
  }
}
