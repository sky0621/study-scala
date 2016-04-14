package p2nd.chap04

import java.util.Calendar

/**
  *  2016/02/03.
  */
object M068_var_default extends App {
  // 引数にデフォルト値

  def discount(total: Int, discount: Int = 500): Int = total - discount

  println(discount(1200))
  println(discount(300, 50))

  // デフォルト値を関数にできる
  def discount2(total: Int, discount: Int = {
    if (Calendar.getInstance().get(Calendar.DATE) % 2 == 0) 500
    else 200
  }) = total - discount

  println(discount2(10000))

  println(discount(total = 2500))
  println(discount(total = 300, discount = 150))
}
