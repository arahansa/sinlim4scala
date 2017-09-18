package chap04.chap04_4

object Chap04_4 {


  def mean(xs: IndexedSeq[Double]) : Either[String, Double]=
    if(xs.isEmpty)
      Left(" mean of empty list ")
    else
      Right(xs.sum / xs.length)

}
