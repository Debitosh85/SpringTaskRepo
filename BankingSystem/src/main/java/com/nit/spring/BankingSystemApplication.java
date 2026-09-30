package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankingSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		BankService bean = ctx.getBean(BankService.class);
		bean.showCustomerAccount();
		
	}
}
