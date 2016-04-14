package p1st.sample

/**
  *  2016/01/03.
  */
class SampleClass {

  val outerVal = "OuterVal!"

  def printHello = println("HeLLooooooo!!!")

  def greet(t: String) = "How are you? Mr." + t

  def callPrivate = privateDef

  def checkNo(no: Int) =
    if(no > 0) {
      "+"
    } else if(no == 0) {
      "="
    } else {
      "-"
    }

  def user: (Int, String) = (15, "Taro.S")

  private

  def privateDef = println("Private!")
}
