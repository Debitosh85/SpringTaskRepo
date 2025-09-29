package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class AutowireImplicitInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService service = ctx.getBean(ProductService.class);
		service.showDetails();
		((AbstractApplicationContext) ctx).close();
		
	}

}
