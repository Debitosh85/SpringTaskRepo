package com.nit.sbean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("d4")
@Lazy(true)
public class Demo4 {
	
	public Demo4() {
		System.out.println("D4 Ctd");
	}

}
