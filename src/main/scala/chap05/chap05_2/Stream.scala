package chap05.chap05_2


sealed trait Stream[+A]
case object Empty extends Stream[Nothing]
case class Cons[A](h:()=>A, t:()=>Stream[A]) extends Stream[A]
object Stream {

  def cons[A](hd: => A, tl: Stream[A]): Stream[A] = {
    lazy val head = hd
    lazy val tail = tl
    Cons(()=> head, ()=> tail)
  }

  def empty[A]: Stream[A] = Empty

  def apply[A](as: A*): Stream[A] =
    if(as.isEmpty) empty else cons(as.head, apply(as.tail: _*))

  /*def exists[A](p: A => Boolean): Boolean = this match{
    case Cons(h,t) => p(h()) || t().exists(p)
    case _ => false
  }


  def main(args: Array[String]): Unit = {

    val ones: Stream[Int] = Stream.cons(1, ones)
    ones.take(5).toList


  }*/

}
