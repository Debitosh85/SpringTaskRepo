package com.nit.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Flipkart;

public class LazyMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		String msg= fpkt.purchase(new String[]{"Dress","Mobile","Sweets"},new double[] {20000.0,500000.0,400});
		
		System.out.println(msg);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		int fk1 = fpkt.hashCode();
		
		int fk2= fpkt.hashCode();
		
		System.out.println(fk1==fk2);
		
		System.out.println(ctx.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		ctx.close();
	}
}
