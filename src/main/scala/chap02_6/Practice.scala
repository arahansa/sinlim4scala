package chap02_6

import chap02_5.Practice.isSorted

object Practice {

  def curry[A,B,C](f:(A,B) => C): A => (B =>C ) = {(a:A) => (b:B) => f(a,b)}

  def uncurry[A, B, C](f: A => B => C) : (A,B) => C = {(a:A, b:B) => f(a)(b)}

  def compose[A,B,C](f: B => C, g:A => B) : A => C = {(a:A)=>f(g(a))}




  def main(args: Array[String]): Unit ={
    val f = curry( (a : Int , b: Int) => a+b )
    val g = f(1)
    val result = g(2)
    println("result :", result)

    val u = uncurry((a:Int) => (b:Int) => a+b)
    val result2 = u(1,2)
    println("result :", result2)


    def x (a:Int) : Int  = a+1
    def y(b:Int) : Int = b*10
    val xAndThenY = x _ andThen y _
    println(" x andThen y : ", xAndThenY(1))

    val xComposeY = x _ compose y _
    println(" x compose y : ", xComposeY(1))


  }
}
