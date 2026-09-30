package com.java.target;

import com.java.dependent.DiselEngine;
import com.java.dependent.E20Engine;
import com.java.dependent.IEngine;
import com.java.dependent.PetrolEngine;

public class EgineFactory {
	public static EngineTarget getInstance(String type) {
		
		IEngine eng = null;
		
		if(type.equals("Diesel")) {
			eng = new DiselEngine();
			
		}else if(type.equals("Petrol")){
			
			eng = new PetrolEngine();
			
		}else if(type.equals("E20")) {
			eng = new E20Engine();
		}else {
			throw new IllegalArgumentException();
		}
		
		EngineTarget e = new EngineTarget();
		e.setEngine(eng);
		String msg = e.mileageAcFuel(new int[]{30,40,50},new int[]{150,120,300});
		System.out.println(msg);
		return e;
	}
}
