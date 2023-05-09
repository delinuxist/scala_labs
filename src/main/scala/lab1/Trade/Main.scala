package lab1.Trade

import lab1.Trade.*

object Main extends App {
   val t1: Trade = new Trade("1","APPL",5,20.5,20.4)
   t1.price = 30.5

   val t2: Trade = Trade("2","PPL",3,10.1,5.5)

    println(t1)
    println(t2)
    println(t2.value)
}
