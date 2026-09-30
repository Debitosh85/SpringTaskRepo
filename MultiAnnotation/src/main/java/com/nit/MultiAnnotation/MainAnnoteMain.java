package com.nit.MultiAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cconfig.AppConfig;
import com.nit.target.Demo;

public class MainAnnoteMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		
			Demo d = ctx.getBean("prn1", Demo.class);
			
			Demo d1 = ctx.getBean("prn2", Demo.class);
			
			Demo d2	 = ctx.getBean("prn2", Demo.class);
			
			
			System.out.println("prn==prn2"+(d==d1));
			
			int h1 = d.hashCode();
			
			int h2 = d1.hashCode();
			
			int h3 = d2.hashCode();
			
			System.out.println(h1+" "+h2+" "+h3);  
			

		/*Demo d = ctx.getBean(Demo.class);
		Demo d1 = ctx.getBean(Demo.class);
		
		System.out.println("d==d1"+(d==d1));
		
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());*/
	}
}
