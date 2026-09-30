package com.nit.target;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {
	
	private static Demo INSTANCE;
	
	private Demo() {
		System.out.println("Demo 0 Param Constructor");
	}
	public static Demo getInstance() {
		System.out.println("get Instance Method......");
		if(INSTANCE==null) {
			
		  INSTANCE=new Demo();
		}
		return INSTANCE;
	}
}
