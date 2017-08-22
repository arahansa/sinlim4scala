package chap04.chap04_2

sealed trait Option[+A]
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]


object Option{


}
