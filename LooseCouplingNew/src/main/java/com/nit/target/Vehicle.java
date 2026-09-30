package com.nit.target;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	private IEngine engine;
	
	@Autowired
	@Qualifier("motor")
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public IEngine getengine() {
		return engine;
	}
	
	public void veModel(String name,String engName) {
		System.out.println(name+" "+"is new model in market having:"+engName);
		engine.start();
		engine.end();
	}
}
