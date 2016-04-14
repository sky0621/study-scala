package p2nd.chap05

/**
  *  2016/03/17.
  */
object M106_List {

  def main(args: Array[String]): Unit = {

    val list = List("Abc", "Def", "Ghi")
    println(list)

    val list2 = "aBC" :: "dEF" :: Nil
    println(list2)

    val list3 = ("aBc" :: "AbC" :: "abc" :: Nil) :: ("dEf" :: "DeF" :: "def" :: Nil) :: Nil
    println(list3)

  }
}
