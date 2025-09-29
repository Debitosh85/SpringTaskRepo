package com.nit.spring;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookClass  implements BookRepo{

	List<String> book ;
	
	public void bookCollection() {
		
		book =  new ArrayList();
		book.add("Spring");
		book.add("Core java");
		book.add("Advanced Java");
		
//		for(String books:book) {
//			System.out.println("AvailableBooks are "books);
//		

		System.out.println(book.toString());
		
	}
}
