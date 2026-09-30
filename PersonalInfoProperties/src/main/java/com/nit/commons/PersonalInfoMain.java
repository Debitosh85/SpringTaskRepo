package com.nit.commons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.configuration.AppConfig;
import com.nit.sbeans.PersonalInfo;

public class PersonalInfoMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonalInfo p = ctx.getBean(PersonalInfo.class);
		
		System.out.println(p);
	}
}
