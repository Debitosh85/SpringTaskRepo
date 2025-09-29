package com.nit.spring;

public class Car {
	
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void displayCarInfo() {
		System.out.println("Engine is :"+engine.getType());
		System.out.println("Horse Power of the Engine:"+engine.getHorsePower()+"Hp");
	}

}
