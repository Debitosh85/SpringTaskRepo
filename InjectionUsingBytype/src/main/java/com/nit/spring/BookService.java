package com.nit.spring;

public class BookService {
	
	 Book book;
	
	 
	public void setBook(Book book) {
		this.book = book;
	}
	public void showDemo() {
		System.out.println("Book Name is :"+book.getBookName());
		System.out.println("Book id is:"+book.getBookId());
	}
	
	
	
}
