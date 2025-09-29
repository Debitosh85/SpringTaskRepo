package com.nit.spring;

public class LibraryClass {
	
	private Book book;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void showBookDetails() {
		System.out.println("Title of the Book is::"+book.getTitle());
		System.out.println("Author of the Book is::"+book.getAuthor());
	}

}
