package com.nit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class NotificationInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationManager m = ctx.getBean(NotificationManager.class);
		m.NotifyManage("Your otp is 123");
	    ((AbstractApplicationContext) ctx).close();
		
		
		
	}

}
