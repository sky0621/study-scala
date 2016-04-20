package p3rd.ch02

case class Employee(id: Int, name: String)

/**
  * 2016/04/20.
  */
object M040toXXX_match {
  def main(args: Array[String]): Unit = {
    val lang: String = "Scala2"
    lang match {
      case "Java" => {
        println("javA")
      }
      case "Scala" => {
        println("scalA")
      }
      case _ => {
        println("Other:" + lang)
      }
    }

    val str = "abcdefg"
    println(getLength(str))
    val ary = Array(1, 3, 5, 7)
    println(getLength(ary))
//    val dbl = Double
//    println(getLength(dbl))

    val emp = Employee(333, "Taro")
    caseclassMatch(emp)
    val emp2 = Employee(1, "Jiro")
    caseclassMatch(emp2)
    val emp3 = Employee(2, "Hanako")
    caseclassMatch(emp3)

    ptnGuard((3, 2))
    ptnGuard((4, 4))
    ptnGuard((5, 6))

    // 関数の引数に対するマッチング
    val func: String => Unit = {
      _ match {
        case "Scala" => println("Scala!")
        case _ => println("Scala以外!")
      }
    }
    func("Scala")
    func("Java")
  }

  // 型に応じたマッチング
  def getLength(value: AnyRef): Int = {
    value match {
      case x: String => x.length
      case x: Array[_] => x.length
      case x: Integer => x
      case _ => throw new IllegalArgumentException
    }
  }

  // ケースクラスコンストラクタに応じたマッチング
  def caseclassMatch(emp: Employee) =
    emp match {
      case Employee(_, "Taro") => {
        println("Taro")
      }
      case Employee(1, _) => {
        println(1)
      }
      case Employee(_, _) => {
        println(emp)
      }
    }

  // 条件指定でマッチング
  def ptnGuard(tpl: (Int, Int)): Unit = {
    tpl match {
      case (x, y) if x > y => {
        println("x > y")
      }
      case (x, y) if x == y => {
        println("x == y")
      }
      case _ => {
        println("x < y")
      }
    }
  }
}
