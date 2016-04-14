package p2nd.chap04

/**
  *  2016/02/04.
  */
object M075_sealed extends App {

  // パターンマッチ
  def message(m: Message) = m match {
    case TextMessage() => println("TextMessage")
    case ObjectMessage() => println("ObjectMessage")
    // case ByteMessage() => println("ByteMessage")
  }

  message(new TextMessage)
}

// シールドクラス
// このクラスを継承できるのは同一ファイル内のクラスのみに限定される
sealed abstract class Message

// シールドクラスを継承したクラス
case class TextMessage() extends Message
case class ObjectMessage() extends Message
case class ByteMessage() extends Message
