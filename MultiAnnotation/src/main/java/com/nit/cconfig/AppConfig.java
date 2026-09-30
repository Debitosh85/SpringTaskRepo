package com.nit.cconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nit.target.Demo;

@Configuration
@ComponentScan("com.nit.target")
public class AppConfig {
	@Bean("prn1")
	@Scope("prototype")
	public Demo d1() {
		return Demo.getInstance();
	}
	
	@Bean("prn2")
	@Scope("prototype")
	public Demo d2() {
		return Demo.getInstance();
	}
	
	@Bean("prn3")
	@Scope("prototype")
	public Demo d3() {
		return Demo.getInstance();
	}
}
