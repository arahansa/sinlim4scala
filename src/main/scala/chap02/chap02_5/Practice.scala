package chap02.chap02_5




object Practice {

  def isSorted[A](as:Array[A], ordered: (A,A) => Boolean ) : Boolean = {
    def go(n: Int): Boolean ={
      if(as.lengthCompare(n)==1) true
      else if(ordered(as(n), as(n+1))) go(n + 1)
      else false
    }
    go(0)
  }

  def main(args: Array[String]): Unit ={
    def p[Integer](x:Int, y:Int ): Boolean = { x < y }
    println("첫 번째 결과  :", isSorted(Array(1,2,3,4,5,6), p))
    println("두 번째 결과  :", isSorted(Array(1,2,4,3,5,6), p))
  }

}
