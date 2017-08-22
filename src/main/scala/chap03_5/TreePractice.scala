package chap03_5

/**
  * Created by lucas.choi on 2017. 8. 18..
  */
object TreePractice {


  def main(args: Array[String]): Unit = {

    val b = Branch[Int](Leaf(1), Leaf(1))
    println("size :", Tree.size(b))

    val a:Leaf[Int] = Leaf(value=3)
    val c:Branch[Int] = Branch(a,a)
    val d = Branch(c,a)
    println("size :", Tree.size(d))

  }
}
