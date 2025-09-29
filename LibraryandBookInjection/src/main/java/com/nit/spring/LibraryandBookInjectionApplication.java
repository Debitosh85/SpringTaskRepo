package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class LibraryandBookInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		LibraryClass cls = ctx.getBean(LibraryClass.class);
		cls.showBookDetails();
		
		((AbstractApplicationContext) ctx).close();
	}

}
