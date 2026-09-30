package com.nit.spring;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UniversityExamResultProcessingSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		GradeNotifier bean = ctx.getBean(GradeNotifier.class);
		bean.notifyResult();
		((AbstractApplicationContext) ctx).close();
		

	}

}
