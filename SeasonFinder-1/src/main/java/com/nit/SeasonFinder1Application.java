package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.SeasonFinder;

@SpringBootApplication
public class SeasonFinder1Application {
	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SeasonFinder1Application.class, args);
		
		SeasonFinder s = ctx.getBean("sf", SeasonFinder.class);
		
		String msg = s.getMonth();
		
		System.out.println("Current Season is::"+msg);
		
	    ((ConfigurableApplicationContext) ctx).close();
	}
}
