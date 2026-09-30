package com.nit.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HospitalManagementSystemApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		HospitalService bean = ctx.getBean(HospitalService.class);
		bean.generateHospitalBill();
		bean.showSummary();
		((AbstractApplicationContext) ctx).close();
		
	}

}
