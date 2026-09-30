package com.nit.SingletonProjSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nit.ston.SingtnClass;

@Configuration
@ComponentScan("com.nit.Ston")
public class AppConfig {

	@Bean("s")
	@Scope("singleton")
	public SingtnClass s() {
		return new SingtnClass();
	}
	
	@Bean("s1")
	@Scope("singleton")
	public SingtnClass s1() {
		return new SingtnClass();
	}
}
