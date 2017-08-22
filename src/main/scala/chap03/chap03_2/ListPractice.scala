package chap03.chap03_2

/**
  * Created by lucas.choi on 2017. 8. 18..
  */
object ListPractice {

  def main(args: Array[String]): Unit = {
    println(List.sum2(List(1,2,3,4)))
    println(List.product2(List(1.0, 2.0, 3.0)))
    println(List.product2(List(1.0, 0.0, 3.0, 4.0)))


    println("length : ")
    println(List.length(List(1,2,3,4)))
    println(List.length(List(1,2,3,4,5,6)))

  }

}
