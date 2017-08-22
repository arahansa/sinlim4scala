package chap02_5

object PolyFunc {


  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if(n >= ss.length) -1
      else if ( ss(n) == key) n
      else loop(n+1)

    loop(0)
  }

  def findFirstPoly[A](as: Array[A], p: A=> Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if(n >= as.length) -1
      else if ( p(as(n))) n
      else loop(n+1)

    loop(0)
  }

  def main(args: Array[String]): Unit ={
    println(findFirst(Array("tt", "result", "test"), "test"))

    def p[A](e:A): Boolean = { e.equals("test") }


    println(findFirstPoly(Array("tt", "result", "1test", "test"), p))
  }




}
