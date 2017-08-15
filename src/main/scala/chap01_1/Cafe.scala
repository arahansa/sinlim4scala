package chap01_1



class Cafe01{


  def buyCoffee(cc : CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price)
    cup
  }



}


class Cafe02{
  def buyCoffee(cc : CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()
    p.charge(cc, cup.price)
    cup
  }
}

class Cafe3{

  def buyCoffee(cc: CreditCard) : (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }
}