package com.nit.spring;

public class BookService {
	
	private InMemoryBookClass kitab;
	
	public BookService(InMemoryBookClass kitab) {
		this.kitab = kitab;
	}
	
	public void showInforMation() {
		kitab.bookCollection();
	}

}
