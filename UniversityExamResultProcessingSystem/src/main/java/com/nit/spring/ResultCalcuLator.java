package com.nit.spring;

public class ResultCalcuLator {
	
	private Student info;
	
	public void setInfo(Student info) {
		this.info = info;
	}
	
	public Student getInfo() {
		return info;
	}
	
	public void generateresult() {
		
		int avg = info.getAvg();
		
		if(avg>=75) {
			System.out.println("Distinction");
		}else if(avg>=60 && avg<=74) {
			System.out.println("First Class");
		}else if(avg>=50 && avg<=59) {
			System.out.println("Second Class");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
