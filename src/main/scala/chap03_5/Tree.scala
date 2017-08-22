package chap03_5

/**
  * Created by lucas.choi on 2017. 8. 18..
  */




sealed trait Tree[+A]
case class Leaf[A](value:A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


object Tree {
  // https://stackoverflow.com/questions/19606802/add-two-tuples-constaining-simple-elements-in-scala
  implicit class TuppleAdd(t: (Int, Int)) {
    def +(p: (Int, Int)) = (p._1 + t._1, p._2 + t._2)
  }


  def size(t:Tree[Int]):(Int,Int) = t match {
    case Leaf(value) => (1,0)
    case Branch(left, right)  =>  (0,1) + size(left) + size(right)
  }

}