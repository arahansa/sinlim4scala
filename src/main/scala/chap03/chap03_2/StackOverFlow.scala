package chap03

import chap03.chap03_2.{Cons, List}

object StackOverFlow {


  def setHead[A](a:A, l:List[A]): List[A] = l match{
    case _ => Cons(a, l)
  }

  def loop(n: Int, max: Int, l: List[Int]): List[Int] =
    if(n >= max) l
    else loop(n+1, max, setHead(n, l))


  def main(args: Array[String]): Unit = {
    // 연습문제 3.10
    println(loop(0, 630, List(-2,-1)))

    // foldRight  스택오버플로
    // println(List.foldRight(loop(0, 999, List(-2,-1)),1)((x,y)=>x+y))

  }
}
