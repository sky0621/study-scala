package p2nd.chap08

import scala.swing._

/**
  *  2016/04/08.
  */
object M165_GUI extends SimpleSwingApplication {
  override def top: Frame = new MainFrame {
    title="サンプル"
    preferredSize = new java.awt.Dimension(500, 300)
    contents = new Button() {
      action = Action("クリック") {
        Dialog.showMessage(
          title = "メッセージ",
          message = "こんにちは、Scala",
          messageType = Dialog.Message.Info
        )
      }
    }
  }
}
