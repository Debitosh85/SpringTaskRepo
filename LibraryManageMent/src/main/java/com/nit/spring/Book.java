package com.nit.spring;

public class Book {
	
	private int bookId;
	private String bookName;
	private double price;
	private Author author;
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}

}
