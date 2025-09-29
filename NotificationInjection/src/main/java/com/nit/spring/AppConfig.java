package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public EmailNotification notification() {
		return new EmailNotification();
	}
	
	@Bean 
	public SmsNotification sms() {
		return new SmsNotification();
	}
	
	@Bean
	public NotificationManager manage() {
		NotificationManager m = new NotificationManager();
		m.setService(sms());
		return m;
	}
	
	

}
