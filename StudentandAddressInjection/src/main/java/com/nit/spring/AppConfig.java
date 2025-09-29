package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean()
	public Address address() {
		Address a = new Address();
		a.setCity("Bhubaneswar");
		a.setState("Odisha");
		return a;
	}
	@Bean
	public Student student() {
		Student stu = new Student();
		stu.setName("Debitosh");
		stu.setAddress(address());
		return stu;
	}

}
