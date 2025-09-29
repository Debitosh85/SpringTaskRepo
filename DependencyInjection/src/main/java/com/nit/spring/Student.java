package com.nit.spring;

public class Student {
	
	Book book;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void showDemo() {
		System.out.println("Setter Injection:"+book.readBook());
	}

}
