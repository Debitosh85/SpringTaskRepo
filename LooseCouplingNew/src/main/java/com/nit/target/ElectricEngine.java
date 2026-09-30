package com.nit.target;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {
	
	@Override
	public void start() {
		System.out.println("Electric engine Journey started");
	}
	
	@Override
	public void end() {
		System.out.println("Electric Engine Journy ended....");
	}

}
