package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTaskApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Test.xml");
		//Test t1 = (Test)ctx.getBean("spring");
		Test t1 = ctx.getBean(Test.class);
		System.out.println(t1);
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
