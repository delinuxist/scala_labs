package lab1.Library

import lab1.Library.Book.idGenerator

class Book (val bookTitle:String){
  idGenerator = idGenerator+1
  private val bookId = idGenerator
  
  override def toString = s"Book($bookId, $bookTitle)"
}

object Book {
  var idGenerator = 0
  def apply(bookTitle: String) = new Book(bookTitle)
  
}
