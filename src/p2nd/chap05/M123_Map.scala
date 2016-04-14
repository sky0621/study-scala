package p2nd.chap05

/**
  *  2016/03/24.
  */
object M123_Map {
  def main(args: Array[String]): Unit = {
    val map: Map[Int, String] = Map()
    println(map.isEmpty)

    val map2: Map[Int, String] = Map(
      1 -> "Taro",
      2 -> "Jiro",
      3 -> "Hana"
    )
    println(map2.isEmpty)
    println(map2)
    println(map2.get(3))
    println(map2.get(2).get)

    val tpl = "script" -> "JavaScript"
    println(tpl)

    println("【キー】")
    map2.keys.foreach { println }

    println("【バリュー】")
    map2.values.foreach { println }

    map2.foreach {
      case (key, value) => println("[%d]%s".format(key, value))
    }

    val map3 = map2 + (4 -> "Umeko", 5 -> "Saburo")
    println(map3)
    val map4 = map3 - 3
    println(map4)
    val map5 = map3 -- List(2, 4)
    println(map5)
  }
}
