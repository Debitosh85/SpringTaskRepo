package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.SingletonProjSpring.AppConfig;
import com.nit.ston.SingtnClass;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SingtnClass s = ctx.getBean("s",SingtnClass.class);
		
		SingtnClass s1 = ctx.getBean("s1",SingtnClass.class);
		
		
		
		System.out.println(s.hashCode()+"\n"+s1.hashCode());
		
		System.out.println("s==s1:\n ?"+(s==s1));
		
	}

}
