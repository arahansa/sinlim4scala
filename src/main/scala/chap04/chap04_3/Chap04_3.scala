package chap04.chap04_3

object Chap04_3 {
  // def lift[A,B] (f:A=>B): Option[A] => Option[B] = _ map f

  // val abs0: Option[Double] => Option[Double] = lift(math.abs)

  def insuranceRateQuote(age: Int, numberOfSpeedingTickets: Int): Double = {
    return 0; //  모의로 0
  }

  /*def parseInsuranceRateQuote(age: String, numberOfSpeedingTickets: String): Option[Double] = {
    val optAge: Option[Int] = Try(age.toInt)
    val optTickets: Option[Int] = Try(numberOfSpeedingTickets.toInt)
    insuranceRateQuote(optAge, optTickets)
  }

  def parseInsuranceRateQuote(age: String, numberOfSpeedingTickets: String): Option[Double] = {
    val optAge: Option[Int] = Try(age.toInt)
    val optTickets: Option[Int] = Try(numberOfSpeedingTickets.toInt)
    map2(optAge, optTickets)(insuranceRateQuote)
  }

  def Try[A](a: => A): Option[A] = try Some(a) catch{ case e: Exception => None}

  def parseInts(a: List[String]): Option[List[Int]] =
    sequence(a map (i => Try(i.toint)))

  def traverse[A,B](a: List[A])(f: A=> Option[B]): Option[List[B]]*/

}
