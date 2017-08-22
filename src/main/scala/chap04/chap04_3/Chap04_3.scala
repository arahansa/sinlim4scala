package chap04.chap04_3

object Chap04_3 {

  def meanOptional(xs: Seq[Double]) : Option[Double] = {
    if(xs.isEmpty) None
    else Some(xs.sum / xs.length)
  }

}
