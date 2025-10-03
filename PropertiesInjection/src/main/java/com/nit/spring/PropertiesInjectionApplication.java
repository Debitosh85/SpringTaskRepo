package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		GroceryShop g = ctx.getBean(GroceryShop.class);
		g.ListofGroceryItems();
		((AbstractApplicationContext) ctx).close();
	}

}
