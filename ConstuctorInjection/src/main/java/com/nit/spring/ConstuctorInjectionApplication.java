package com.nit.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstuctorInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Manager mgr =ctx.getBean(Manager.class);
		mgr.ShowInfo();
		((AbstractApplicationContext) ctx).close();
		
		

	}

}
