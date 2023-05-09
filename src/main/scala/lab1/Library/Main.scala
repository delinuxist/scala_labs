package lab1.Library

object Main extends App{
  val m1: Member = Member("Emmanuel","Obeng",Membership.JUNIOR)
  val m2: Member = Member("Zenas","Rose")

  val b1: Book = Book("Kiriku")
  val b2: Book = Book("Iron Man")

  val library: Librarian = Librarian("Turntabl")

  library.addBook(b1)
  library.addBook(b2)

  library.get_books.forEach(println)
}
