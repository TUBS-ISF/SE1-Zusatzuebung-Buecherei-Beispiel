package library;

import java.util.List;

import book.Book;

public class Library {
	
	private List<Book> books; //all books from the library
	public List<Book> availableBooks; //books that are not borrowed (subset from books list)
	private List<Librarian> staff;
	
	//checks if a book is available, by searching for it in the availableBooks list
	public boolean checkAvailablity(Book book) {
		if (availableBooks.contains(book)) {
			return true;
		} else {
			return false;
		}
	}
	
	//adds a new book to the library and list of available books
	public void addNewBook(Book book) {
		books.add(book);
		availableBooks.add(book);
	}
	
	//employs a new librarian by adding him to the staff list
	public void employ(Librarian librarian) {
		staff.add(librarian); 
	}

}
