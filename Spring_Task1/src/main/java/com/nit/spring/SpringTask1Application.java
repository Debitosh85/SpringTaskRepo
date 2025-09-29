package com.nit.spring;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTask1Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Test.xml");
		Test t1 = ctx.getBean(Test.class);
		((AbstractApplicationContext) ctx).close();
		System.out.println(t1);
		
	}

}
