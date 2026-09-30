package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("DHL")
@Lazy(true)
public class DHL implements IFlip {
	
	@Override
	public void shopping() {
		System.out.println("Shopping done through DHL");
	}
}
