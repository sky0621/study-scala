package p2nd.chap04

import java.io.{FileOutputStream, OutputStream}

/**
  *  2016/02/17.
  */
object M091_seigen_henni extends App {
  // 制限付き型パラメータ（境界）
  // 上限境界：[A <: MyClass] ... <A extends MyClass>相当。MyClassかサブクラス。
  // 下限境界：[A >: MyClass] ... 相当なし。MyClassかスーパークラス。
  // 可視境界：[A <% MyClass] ... MyClassとして扱える（暗黙の型変換）クラスに制限。

  val fs: FileStore[FileOutputStream] = new FileStore[FileOutputStream]

}

class FileStore[A <: OutputStream]

