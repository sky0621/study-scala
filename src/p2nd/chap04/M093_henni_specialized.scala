package p2nd.chap04

/**
  *  2016/02/17.
  */
object M093_henni_specialized extends App {
  // 通常、型パラメータはコンパイルするとバイトコード上から型情報が削除される（「型消去」）。そして、Any型に変換される。
}

// すべてのプリミティブ型に対応した実装を生成
class M093_HelloWorld[@specialized T] {

}

// Int型に対応した実装のみ生成
class M093_HelloWorld2[@specialized(Int) T] {

}