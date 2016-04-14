package p2nd.chap02

/**
  *  2016/01/20.
  */
object M035_for extends App{

  // for式
  //   for( i <- n1 to nx ) {  }
  //   for( i <- Range(3, 8) ) {  }
  //   for( i <- List("A", "B", "C") ) {  }

  // 3ずつインクリメントしながらループ
  // scala.runtime.RichIntで定義された to メソッド
  for(i <- 1 to (10, 3)) println(i)

  println("--------------")

  val rg = Range(3, 21)
  for(i <- rg) println(i)


}
