package com.nit.spring;

import java.util.Map;

public class Student {
	
	Map<String,Integer> info;
	
	public void setInfo(Map<String,Integer> info) {
		this.info = info;
	}
	
	public void ShowDetails() {
		System.out.println("Students are in Insttitution::"+info);
	}

}
