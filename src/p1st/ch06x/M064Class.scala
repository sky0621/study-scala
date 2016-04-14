package p1st.ch06x

/**
  *  2016/01/03.
  */
class M064Class {

  val outerVal: String = "outerVal"

  class M064Inner {
    private val inner = "Inner"
    val innerPubVal = "InnerPubVal"
  }
//
//  val outer1 = new M064Class
//  val outer2 = new M064Class
//
//  var inner1 = new outer1.M064Inner
//  var inner2 = new outer2.M064Inner
//  inner1 = inner2
//
}
