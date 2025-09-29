package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StudentandAddressInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu = ctx.getBean(Student.class);
		stu.showStudentDetails();
	    ((AbstractApplicationContext) ctx).close();
	}

}
