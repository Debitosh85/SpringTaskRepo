package com.nit.target;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
	
	@Override
	public void start() {
		System.out.println("Petrol engine Journey started....");
	}
	
	@Override
	public void end() {
		System.out.println("Petrol Engine Journy ended...");
	}
}
