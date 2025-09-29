package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.spring")
public class AppConfig {
	
	@Bean
	public Book book() {
		Book b = new Book();
		b.setAuthor("Rod Johnson");
		b.setTitle("Spring");
		return b;
	}
	@Bean
	public LibraryClass lib() {
     LibraryClass cls = new LibraryClass();
     cls.setBook(book());
     return cls;
	}

}
