package chap03.chap03_2

object Practice {


  def sum(ints: List[Int]): Int = ints match{
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  val x = List(1,2,3,4,5) match{
    case Cons(x, Cons(2, Cons(4,_))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4,_)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }


  // 연습문제 3.2
  def tail[A](l:List[A]): List[A] = l match{
    case Nil => Nil
    case Cons( _ , t) =>  t
  }

  // 연습문제 3.3 setHead 구현하기
  // def setHead
  def setHead[A](a:A, l:List[A]): List[A] = l match{
    case _ => Cons(a, tail(l))
  }


  // 연습문제 3.4 n 개의 요소 drop 화
  def drop[A] (l:List[A], n: Int) : List[A] = n match{
    case 0 => l
    case n => drop(tail(l), n-1)
  }

  // 연습문제 3.5 dropWhile
  def dropWhile[A](l:List[A], f:A => Boolean):List[A] = l match{
    case Cons(h,t) if f(h) => dropWhile(t, f)
    case _ => l
  }

  def dropWhile2[A](l:List[A])(f:A=>Boolean) : List[A] = l match{
    case Cons(h,t) if f(h) => dropWhile2(t)(f)
    case _ => l
  }


  def main(args: Array[String]): Unit ={
    print("x :", x)
    val onetwothreefor = List(1,2,3,4)
    val tailed = tail(onetwothreefor)
    println("tailed : ", tailed)


    val setHeaded: List[Int] = setHead(10, onetwothreefor)
    println("setHeaded : ", setHeaded)

    val dropeed = drop(onetwothreefor, 2)
    println("dropped : ", dropeed)


    println("dropWhiled : ", dropWhile(onetwothreefor, (a:Int) => a<=3))

    println("dropWhile2 : ", dropWhile2(onetwothreefor)(a => a<=3))

    println("getFirst: ", List.getFirst(List(1,2,3,4,5)))

    println("sum Fold Left: !")
    println("sum Fold Left: ", List.foldLeft(List(1,2,3,4,5), 0)(_ + _));
  }
}
