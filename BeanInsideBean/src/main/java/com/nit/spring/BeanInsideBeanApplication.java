package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInsideBeanApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Configuration.xml");
		Student s= ctx.getBean(Student.class);
		s.studentBioData();
		((AbstractApplicationContext) ctx).close();
	}

}
