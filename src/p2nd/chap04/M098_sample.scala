package p2nd.chap04

/**
  *  2016/02/25.
  */
object M098_sample extends App {
  val cls = new M098_Class
  cls.sh()
}

class M098_Class extends M098_Logic with M098_UserDaoImpl with M098_DivisionDaoImpl {
  def sh() = {
    show(30)
  }
}

trait M098_Logic {
  self: M098_UserDao with M098_DivisionDao =>
  def show(id: Long) = {
    val user = byId(id)
    val divi = allData
    println(user)
    println(divi)
  }
}

trait M098_UserDao {
  def byId(id: Long): String
}

trait M098_DivisionDao {
  def allData: List[String]
}

trait M098_UserDaoImpl extends M098_UserDao {
  def byId(id: Long): String = "ID: %d".format(id)
}

trait M098_DivisionDaoImpl extends M098_DivisionDao {
  def allData: List[String] = List("Development", "Sales", "Business")
}
