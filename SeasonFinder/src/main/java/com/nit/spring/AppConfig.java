package com.nit.spring;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("basepackages = com.nit.spring")
public class AppConfig {

	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}
}
