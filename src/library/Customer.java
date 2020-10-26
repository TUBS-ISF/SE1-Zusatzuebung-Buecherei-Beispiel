package library;

import java.util.List;

import book.Book;

public class Customer {
	
	public int customerID;
	public String name;
	public List<Book> borrowedBooks;
	
	public void returnBook(Book book) {
		book.borrowedBy = null; //borrowed by nobody
		book.library.availableBooks.add(book); //add book to the list of available books in the library
	}
	
	/*
	 * TODO: implement this method (was done in the live exercise)
	 * -> remove all books from borrowedBooks
	 * -> remove borrowedBy in Book
	 * -> add book to availableBooks in Library
	 */
	public void returnAllBooks() {
		
		/*
		 * implementation with a for loop:
		 */
		for (int i = borrowedBooks.size() - 1;
				i >= 0; 
				i--) {
			Book book = borrowedBooks.get(i);
			borrowedBooks.remove(book);
			book.borrowedBy = null;
			book.library.availableBooks.add(book);
		}
		return;
		
		/*
		 * implementation with a while loop:
		 */
//		int i = borrowedBooks.size() - 1;
//		while (i >= 0) {
//			Book book = borrowedBooks.get(i);
//			borrowedBooks.remove(book);
//			book.borrowedBy = null;
//			book.library.availableBooks.add(book);
//			i--;
//		}
//		return;
		
		/*
		 * implementation with a do-while loop:
		 */
//		if (borrowedBooks.isEmpty()) {
//			return;
//		}
//		int i = borrowedBooks.size() - 1;
//		do {
//			Book book = borrowedBooks.get(i);
//			borrowedBooks.remove(book);
//			book.borrowedBy = null;
//			book.library.availableBooks.add(book);
//			i--;
//		} while(i >= 0);
//		return;
	}
	
	/* 
	 * TODO: implement this method  (was done in the live exercise)
	 * -> check if book is available
	 * -> remove book from available list of books
	 * -> add customer to borrowedBy attribute of the book
	 */
	public boolean borrowBook(Book book) {
		Library lib = book.library;
		if (lib.availableBooks.contains(book)) {
			lib.availableBooks.remove(book); //removes book from list of available books
			book.borrowedBy = this;
			return true; //everything worked, book is borrowed
		} else {
			return false; //book was not not available
		}
	}

}
