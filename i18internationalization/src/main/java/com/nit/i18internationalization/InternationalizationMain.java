package com.nit.i18internationalization;


import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;

public class InternationalizationMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language Code.....");
		String code= sc.next();
		System.out.println("Enter Country Code......");
		
		String countryName= sc.next();
		
		Locale local = Locale.of(code, countryName);
		
		//Locale l = new Locale(code,countryName);
		
		String msg1 = ctx.getMessage("welcome.msg", new String[]{},"msg1",local);
		String msg2 = ctx.getMessage("goodbye.msg", new String[] {},"msg2",local);
		String msg3 = ctx.getMessage("gap.msg", new String[] {}, "msg3",local);
		String msg4 = ctx.getMessage("end.msg", new String[]{}, "msg4",local);
		
		System.out.println(msg1+" "+msg2+" "+msg3+" "+msg4);
		
		ctx.close();
	}
}
