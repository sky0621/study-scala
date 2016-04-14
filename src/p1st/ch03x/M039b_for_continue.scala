package p1st.ch03x

import scala.util.control.Breaks

/**
  *  2015/12/23.
  */
object M039b_for_continue {

  def main(args: Array[String]): Unit = {

    val cont = new Breaks()
    import cont.{break => continue, breakable => continuable}

    for(i <- 1 to 20){
      continuable{
        if(i < 10){
          println("continue")
          continue
        }
        println(i)
      }
    }
  }
}
