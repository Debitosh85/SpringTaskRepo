package com.nit.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class OnlineCourseEnrollmentSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EnrollmentService bean = ctx.getBean(EnrollmentService.class);
		bean.enrollStudent();
		((AbstractApplicationContext) ctx).close();
	}

}
