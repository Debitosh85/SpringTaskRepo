package com.nit.MultiBean;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Demo4;
import com.nit.sbean.Demo5;

public class MultiBeanMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(ctx.getBeanDefinitionCount());
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		
		System.out.println("-------------------------------");
		
		Demo4 d = ctx.getBean(Demo4.class);
		
		Demo5 d1 = ctx.getBean(Demo5.class);
		
	}
}
