package chap06.chap06_2

trait RNG{
  def nextInt: (Int, RNG)
}


case class SimpleRNG(seed: Long) extends RNG {
  def nextInt: (Int, RNG) = {
    val newSeed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
    val nextRNG = SimpleRNG(newSeed)
    val n = (newSeed >>> 16).toInt
    (n, nextRNG)
  }
}


object RNG {

  def main(args: Array[String]): Unit = {
    val rng = SimpleRNG(42)

    val (n1, rng2) = rng.nextInt
    println(n1, rng2)

    val (n2, rng3) = rng2.nextInt
    println(n2, rng3)
  }
}
