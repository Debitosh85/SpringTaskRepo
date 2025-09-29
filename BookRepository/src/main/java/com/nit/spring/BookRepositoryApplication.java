package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BookRepositoryApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		BookService serv = ctx.getBean(BookService.class);
		serv.showInforMation();
	    ((AbstractApplicationContext) ctx).close();
	}

}
