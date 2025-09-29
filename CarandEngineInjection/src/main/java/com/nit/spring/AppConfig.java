package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Engine engine() {
		Engine e = new Engine();
		e.setType("Petrol");
		e.setHorsePower(746);
		return e;
	}
	
	@Bean
	public Car car() {
		Car c = new Car();
		c.setEngine(engine());
		return c;
	}

}
