package com.nit.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class OnlineShoppingCartSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		CheckoutService bean = ctx.getBean(CheckoutService.class);
		bean.printFinalBill();
		((AbstractApplicationContext) ctx).close();
	}

}
