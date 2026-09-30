package com.java.dependent;

public class PetrolEngine implements IEngine {

	@Override
	public void fuel() {
		System.out.println("Run using Petrol");
	}
}
