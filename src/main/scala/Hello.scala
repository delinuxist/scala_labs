object Hello {
    def main(args:Array[String]): Unit = {
    println("hello world")
        println(multiply(2,3))

      val person:Person = new Person("Jake","lucas")

      println(person.fname);
      print(person.lname);
    }

   def multiply(a: Int, b: Int): Int = a*b
}
