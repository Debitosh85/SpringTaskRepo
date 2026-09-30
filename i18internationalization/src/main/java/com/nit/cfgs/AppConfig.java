package com.nit.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	
	@Bean("messageSource")
	public ResourceBundleMessageSource createMessage() {
		
		ResourceBundleMessageSource bundler = new ResourceBundleMessageSource();
		
		bundler.setBasename("com/nit/commons/myfile");
		
		return bundler;
		
	}
}
