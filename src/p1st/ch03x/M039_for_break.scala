package p1st.ch03x

import scala.util.control.Breaks

/**
  *  2015/12/23.
  */
object M039_for_break {

  def main(args: Array[String]): Unit = {

    val mb = new Breaks()
    import mb.{break, breakable}

    breakable{
      for(i <- 1 to 10) {
        println(i)
        if(i==5){
          println("break!")
          break()
        }
      }
    }

  }
}
