package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public class DTDC implements IFlip {

	@Override 
	public void shopping() {
	   System.out.println("Shopping done through DTDC");
	}
}
