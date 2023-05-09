package lab1.Library

import lab1.Library.Librarian.{books, members}

import java.util

class Librarian(val name: String) {
    def addMember(member: Member) : Unit = {
        members.add(member)
    }
    
    def addBook(book: Book) : Unit = {
        books.add(book)
    }
    
    def get_members: util.ArrayList[Member] = members
    
    def get_books: util.ArrayList[Book] = books
}

object Librarian {
    def apply(name: String) = new Librarian(name)
    private val members: util.ArrayList[Member] = new util.ArrayList[Member]()
    private val books: util.ArrayList[Book] = new util.ArrayList[Book]( )
}
