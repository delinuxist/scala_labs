package lab1.Trade

class Trade (val id: String,val symbol:String,val quantity: Int,var initialPrice: Double,val dividend: Double) {

  private var _price = initialPrice //initialPrice is constructor parameter

  def price: Double = _price //getter method

  def price_=(value: Double): Unit = {
    if (value >= 0) _price = value
  }

  def value: Double = {
    price * quantity
  }

  override def toString: String = {
    s"""
       |ID: ${id}
       |symbol: ${symbol}
       |Quantity: ${quantity}
       |Price: ${price}
       |Dividend ${dividend}
       |""".stripMargin
  }
}


object Trade {
   def apply(id: String,symbol:String,quantity: Int,initialPrice: Double,dividend: Double) =
     new Trade(id,symbol,quantity,initialPrice,dividend)
}
