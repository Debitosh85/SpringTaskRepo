package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LibraryManageMentApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		LibraryService bean = ctx.getBean(LibraryService.class);
		bean.displayBookDetails();
		((AbstractApplicationContext) ctx).close();
		
	}

}
