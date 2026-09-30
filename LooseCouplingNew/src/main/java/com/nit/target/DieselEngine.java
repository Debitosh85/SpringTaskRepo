package com.nit.target;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {
	
	@Override
	public void start() {
		System.out.println("Diesel Engine Journey Started...");
	}
	
	@Override
	public void end() {
		System.out.println("Diesel engine Journey ended.....");
	}

}
