package p1st.ch06x

import scala.annotation.tailrec

/**
  *  2015/12/30.
  */
object M063_func_saiki {

  def main(args: Array[String]): Unit = {

    @tailrec
    def sum(total: Int, list: List[Int]): Int = {

      if(list.isEmpty) total
      else sum(total + list.head, list.tail)  // リストの最初の要素をトータルに加算した結果を新トータルとし、リストの残りの要素を元に再帰
    }

    println(sum(0, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
  }

}
