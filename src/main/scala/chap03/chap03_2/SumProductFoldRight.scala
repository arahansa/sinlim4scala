package chap03.chap03_2

object SumProductFoldRight {

  def sum(ints: List[Int]): Int = ints match{
    case Nil => 0
    case Cons(x, xs) => {
      println("x :", x, ", xs : ", xs)
      x + sum(xs)
    }
  }

  def foldLeftDetail[A,B](as: List[A], z: B)(f: (B,A) => B): B = as match{
    case Nil => z
    case Cons(x,xs)=> {
      println("x :", x , ", xs: ", xs) // 처음에는 1, Cons(2)
      val newZ = f(z,x) // 처음에는 이게 1 이 나오겠지?
      foldLeftDetail(xs, newZ)(f)
    }
  }



  def product(ds: List[Double]) : Double  = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => {
      println("x :", x, ", xs : ", xs)
      x * product(xs)
    }
  }

  def foldRight[A,B](as: List[A], z: B)(f: (A,B)=>B): B = as match{
    case Nil => z
    case Cons(x,xs) => {
      println("x :", x , ", xs: ", xs)
      f(x, foldRight(xs,z)(f))
    }
  }


  println(Nil)
  println(Cons(4,Nil))
  println(Cons(4,Cons(3,Nil)))

  def reverse[A](x:A,y:List[A]):List[A] = {
    val a:List[A] = y match {
      case Nil => {
        println("닐 :")
        Cons(x,Nil)
      }
      case Cons(h,t) =>{
        Cons(h,Cons(x,t))
      }
    }
    a
  }



  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4)
    println("sum : ", sum(List(1, 2, 3, 4)))
    println("product : ", product(List(1, 2, 3, 4)))
    println("fold right sum 시작")
    println("fold Right sum :", List.foldRight(List(1, 2, 3, 4), 0)((x, y) => {
      println("sum 에서의 x :", x, ", y :", y)
      x + y
    }));

    println("foldLeft 시작 !")
    println(foldLeftDetail(l, 0)((x, y) => {
      println("sum 에서의 x :", x, ", y :", y)
      x + y
    }));

    println("foldLeft product 시작 !")
    println(foldLeftDetail(l, 1)((x, y) => {
      println("product 에서의 x :", x, ", y :", y)
      x * y
    }));

    println("목록의 길이?")
    println(foldLeftDetail(l, 0)((x, y) => {
      x + 1
    }));

    println("리버스 전..");
    println(Nil)
    println(Cons(4,Nil))
    println(Cons(4,Cons(3,Nil)))

    println("리버스로 나온 결과 ", reverse(4, Nil))
    println("리버스로 나온 결과 ", reverse(3,reverse(4, Nil)))
    println("리버스로 나온 결과 ", reverse(2,reverse(3,reverse(4, Nil))))

    // 숫자와 리스트를 받아서
    // Nil 일 때는 Cons(숫자, Nil)
    // Cons 일 때는 테일로 가서 테일이 다시 한번 Nil 일때는 Cons(숫자, Nil), 아닐 때는 다시..

    println("리버스로 해보기..")
    println(reverse(l))
  }


  def reverse[A](as: List[A]): List[A] = {
    @annotation.tailrec
    def iter(as: List[A], acc: List[A]): List[A] = as match {
      case Nil => acc
      case Cons(h,t) => iter(t, Cons(h, acc))
    }
    iter(as, Nil)
  }
  def insertCons[A](a: A, l:List[A]) : List[A] = l match{
      case Nil => Cons(a, Nil)
      case Cons(h,t) => Cons(a, insertCons(a, t))
  }




}
