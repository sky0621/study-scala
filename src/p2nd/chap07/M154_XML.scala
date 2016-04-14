package p2nd.chap07

import scala.xml
import scala.xml.{Elem, XML}

/**
  *  2016/03/31.
  */
object M154_XML extends App {

  case class Book(title: String, price: Int, authors: Map[Int, String])

  val book = new Book("Scala逆引きレシピ", 3200, Map(
    1 -> "竹添",
    2 -> "島本"
  ))

  val xml =
    <book>
      <!-- コメント -->
      <title>{book.title}</title>
      <price>{book.price}</price>
      <authors>
        <!-- XMLリテラル -->
        {
          book.authors.map {
            case (key, value) =>
              <author id={key.toString()}>{value}</author>
          }
        }
      </authors>
    </book>

  println(xml)

  XML.save(
    "book.xml",
    xml,
    "UTF-8",
    true
  )

  println("============================")

  val title = xml \ "title"
  println(title)

  val author = xml \ "author"
  println(author)

  val author2 = xml \\ "author"
  println(author2)

  val elem = (xml \ "title").text
  println(elem)

  println("============================")

  val authors = (xml \\ "author").theSeq
  authors.foreach {
    author => author.child.collect {
      case profile: Elem => profile
    } foreach println
  }

}
