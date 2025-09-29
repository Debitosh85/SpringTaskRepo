package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireVariationApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		CheckoutService serv = ctx.getBean(CheckoutService.class);
		serv.paymentServices(1000.0);
		
	}

}
