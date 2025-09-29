package com.nit.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("Configure.xml");
		Company c = ctx.getBean(Company.class);
		c.showInformation();
		((AbstractApplicationContext) ctx).close();
	}

}
