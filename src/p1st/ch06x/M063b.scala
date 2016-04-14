package p1st.ch06x

import scala.util.control.TailCalls._

/**
  *  2015/12/30.
  */
object M063b {

  /*
   * トランポリン（複数の関数が順にお互いを呼び合って再帰すること
   */
  def main(args: Array[String]): Unit = {

    def plus(total: Int, list: List[Int]): TailRec[Int] = {
      if(list.isEmpty) done(total)
      else tailcall(minus(total + list.head, list.tail))
    }

    def minus(total: Int, list: List[Int]): TailRec[Int] = {
      if(list.isEmpty) done(total)
      else tailcall(plus(total - list.head, list.tail))
    }

    println(plus(0, List(100, 50, 10)).result)
    println(plus(0, List(10, 20, 30, 40, 50)).result)
  }

}
