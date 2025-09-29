package com.nit.spring;

public class Book {
	
	private int bookId;
	private String bookName;
	
	public Book() {
		
	}
	
	public void setBookId(int id) {
		this.bookId = id;
	}
	public int getBookId() {
		return bookId;
	}
	
	public void setBookName(String name) {
		this.bookName = name;
	}
	public String getBookName() {
		return bookName;
	}

}
