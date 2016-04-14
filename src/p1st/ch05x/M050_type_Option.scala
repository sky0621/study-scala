package ch05x

/**
  *  2015/12/29.
  */
object M050_type_Option {

  def main(args: Array[String]): Unit = {

    val opt2: Option[String] = Option(null) // => None
    System.out.println(opt2)
    val res2 = opt2.getOrElse(None)
    val res3 = opt2.orNull
    System.out.println(res2)
    System.out.println(res3)
//    System.out.println(res2.isEmpty)

    System.out.println("=====================")
    val r: String = opt2 match {
      case Some(x) => x
      case None => "_"
    }
    System.out.println(r)

  }

}
