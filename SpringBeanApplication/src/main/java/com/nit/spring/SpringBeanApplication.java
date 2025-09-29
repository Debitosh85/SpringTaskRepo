package com.nit.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		
		
		BeanFactory  b = new ClassPathXmlApplicationContext("Bean.xml");
		NewIoc n = b.getBean("debitosh",NewIoc.class);
		System.out.println(n);
		
		
		
	}

}
