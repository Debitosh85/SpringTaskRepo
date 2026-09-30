package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankingTransactionSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		TransactionManagerBean bean = ctx.getBean(TransactionManagerBean.class);
		bean.showAccountHolderDetails();
		bean.performDeposit(10000);
		bean.performithdraw(3000);
		bean.showFinalBalance();
		((AbstractApplicationContext) ctx).close();
		
	}

}
