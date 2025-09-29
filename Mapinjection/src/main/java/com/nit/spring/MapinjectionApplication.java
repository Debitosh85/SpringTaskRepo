package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapinjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Student stu = ctx.getBean(Student.class);
		stu.ShowDetails();
		((AbstractApplicationContext) ctx).close();
		
	}

}
