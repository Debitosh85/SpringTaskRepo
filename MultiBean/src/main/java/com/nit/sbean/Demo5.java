package com.nit.sbean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("d5")
@Lazy(true)
public class Demo5 {

	
	public Demo5() {
		System.out.println("D15 Ctd");
	}
}
