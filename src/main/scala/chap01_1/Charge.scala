package chap01_1

case class Charge(cc: CreditCard, amount: Double) {

  def combine(other: Charge): Charge =
    if(cc == other.cc )
      Charge(cc, amount + other.amount)
    else
      throw new Exception("Can't combine charges to different cards")
}
