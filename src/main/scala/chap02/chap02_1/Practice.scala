package chap02.chap02_1

import chap02.chap02_1.MyModule.formatAbs

object Practice {

  // 0, 1, 1, 2, 3, 5
  // 연습문제 2.1
  def fib(n: Int): Int = {
    def go(n:Int, current: Int, i: Int, j:Int): Int = {
      print("c : ", i+j)
      if(n==current) i+j
      else go(n, current+1, j, i+j)
    }
    go(n, 2, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(10))
  }



}
