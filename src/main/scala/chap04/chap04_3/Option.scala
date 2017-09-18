package chap04.chap04_3











trait Option[+A]
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]
object Option{

  /*def map[B](f: A => B): Option[B] = {
    
  }*/
  /*def flatMap[A, B](f:A => Option[B]): Option[B]
  def getOrElse[B >: A](default: => B): B
  def orElse[B >: A](ob: => Option[B]): Option[B]
  def filter[A](f:A => Boolean): Option[A]*/

}




