package p2nd.chap04

import javax.sql.DataSource

/**
  *  2016/02/25.
  */
object M099_ducktyping extends App {
  def using[T <: {def close}, E](res: T)(f: T => E) = try {
    f(res)
  } finally {
    res.close
  }

//  val ds: DataSource = null
//  using(ds.getConnection) {
//    con =>
//      using(con.prepareStatement("INSRT INTO ...")) {
//        ps =>
//          ps.executeUpdate()
//      }
//  }
}
