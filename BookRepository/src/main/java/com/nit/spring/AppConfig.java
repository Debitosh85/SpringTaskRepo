package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public InMemoryBookClass cls() {
		return new InMemoryBookClass();
	}
	
	@Bean
	public BookService serv() {
		BookService service = new BookService(cls());
		return service;
	}

}
