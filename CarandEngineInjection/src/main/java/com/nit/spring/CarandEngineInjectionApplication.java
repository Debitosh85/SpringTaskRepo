package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CarandEngineInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c = ctx.getBean(Car.class);
		c.displayCarInfo();
	    ((AbstractApplicationContext) ctx).close();
		
	}

}
