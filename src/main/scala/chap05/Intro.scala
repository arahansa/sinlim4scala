package chap05

object Intro {

  def maybeTwice(b: Boolean, i:  => Int) = if(b) i+i else 0

  def maybeTwice2(b: Boolean, i:  => Int) = {
    lazy val j = i
    if(b) j+j else 0
  }

  def main(args: Array[String]): Unit = {
    maybeTwice(true, {println("hi"); 1+41})
    maybeTwice2(true, {println("only one"); 1+41})
  }

}
