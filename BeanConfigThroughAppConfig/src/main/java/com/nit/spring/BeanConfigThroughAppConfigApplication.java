package com.nit.spring;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class BeanConfigThroughAppConfigApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Test t1 = ctx.getBean(Test.class);
		t1.factorial();
		System.out.println(t1);
		((AbstractApplicationContext) ctx).close();
		
	}

}
