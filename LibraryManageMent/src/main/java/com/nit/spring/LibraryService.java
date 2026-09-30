package com.nit.spring;

public class LibraryService {
	
	private Book book;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void displayBookDetails() {
		
		System.out.println("BookId:"+book.getBookId());
		System.out.println("BookName :"+book.getBookName());
		System.out.println("Book written by author:"+book.getAuthor());
	}

}
