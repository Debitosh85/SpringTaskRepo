package com.nit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SeasonFinderApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonFinder s = ctx.getBean("Season", SeasonFinder.class);
		s.getSeason();
		ctx.close();
	}
}
