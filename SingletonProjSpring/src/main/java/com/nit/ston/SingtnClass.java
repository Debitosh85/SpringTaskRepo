package com.nit.ston;

import org.springframework.stereotype.Component;

//@Component("ston")
public class SingtnClass {

	private static SingtnClass obj ;
	
	public SingtnClass() {
		System.out.println("SingtnClass.SingtnClass()");
	}
	
	
	/*
	  private SingtnClass() { }
	 */
	
	public static SingtnClass getInstance() {
		if(obj==null) {
			obj = new SingtnClass();
		}
		return obj;
	}
}
