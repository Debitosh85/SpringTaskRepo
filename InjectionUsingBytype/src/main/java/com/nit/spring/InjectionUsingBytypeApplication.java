package com.nit.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InjectionUsingBytypeApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		BookService s = ctx.getBean(BookService.class);
		s.showDemo();
		
		
	}

}
