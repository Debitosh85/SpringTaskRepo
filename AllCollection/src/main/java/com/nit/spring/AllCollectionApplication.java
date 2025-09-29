package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllCollectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		
		UniverSity stu = ctx.getBean(UniverSity.class);
		stu.showDetails();
		((AbstractApplicationContext) ctx).close();
		
	}

}
