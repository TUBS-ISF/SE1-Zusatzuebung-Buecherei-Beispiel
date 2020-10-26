package book;

import library.Customer;
import library.Library;

public class Book {
	
	public String title;
	public Customer borrowedBy;
	public Library library;
	
	public boolean isBorrowed() {
		return borrowedBy != null; //when customer is null, the book is not borrowed
	}

}
