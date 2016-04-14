package p1st.ch04x

case class Employee(empId: Int, name: String)

/**
  *  2015/12/24.
  */
object M042 {

  def main(args: Array[String]): Unit = {

    caseClassMatchSample(new Employee(2, "Taro2"))
  }

  def caseClassMatchSample(emp: Employee) =
  emp match {
    case Employee(_, "Taro") => {
      println("Taro!!")
    }
    case Employee(1, _) => {
      println("EmpId: 1")
    }
    case Employee(empId, name) => {
      println(empId)
      println(name)
    }
  }
}
