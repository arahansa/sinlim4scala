package chap03.chap03_2



sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head:A, tail:List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match{
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]) : Double  = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }


  def foldRight[A,B](as: List[A], z: B)(f: (A,B)=>B): B = as match{
    case Nil => {
      println("foldRight 의 Nil! 리턴 :", z)
      z
    }
    case Cons(x,xs) => {
      println("foldRight 의 x :", x , ", xs: ", xs)
      f(x, foldRight(xs,z)(f))
    }
  }

  def foldLeft[A, B](as : List[A], z: B)(f:(B,A)=>B):B = {
    var a = 1;
    def loop(az:List[A], zz:B): B= as match{
      case Nil => zz
      case Cons(x, xs) => {
        a = a +1;
        if(a > 10){
          return zz;
        }
        println("as :", xs, " ,  zz :", zz, ", head: ", x, ", result :", f(zz, x))
        foldLeft(xs, f(zz, x))(f)
      }
    }
    loop(as, z)
  }



  def getFirst[A,B](as:List[A]) : A = as match{
    case Cons(x,xs) => x
  }




  def sum2(ns:List[Int]) = foldRight(ns,0)((x,y)=>x+y)
  def sumFoldLeft(ns:List[Int]) = foldLeft(ns,0)((x,y)=>x+y)
  def product2(ns:List[Double]) = foldRight(ns,1.0)((x,y)=>x*y)

  def sum3(ns:List[Int]) = foldLeft(ns, 0)((y,x)=>x+y)


  def product3(x:Double, y:Double) = {
    println("x :", x ,  " , y :", y)
    x * y
  }

  def apply[A](as: A*): List[A] =
    if(as.isEmpty) Nil
    else Cons(as.head, apply(as.tail:_*))

  def length[A](as:List[A]):Int = {
    foldRight(as, 0)((x,y)=> 1 + y)
  }

}
