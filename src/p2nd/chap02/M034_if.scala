package p2nd.chap02

/**
  *  2016/01/20.
  */
object M034_if extends App{
  val base = 10;
  val ifres: String = if(base < 3) "3未満"
  else if(base < 10) "10未満"
  else "10以上"

  println(ifres)
}
