package com.nit.spring;

public class GradeNotifier {
	
	private ResultCalcuLator result;
	
	public void setResult(ResultCalcuLator result) {
		this.result = result;
	}
	
	public void notifyResult() {
		
		Student stud = result.getInfo();
		int avg = stud.calculateAverage();
		
		System.out.println(stud);
		System.out.println("Average Marks:"+avg);
		System.out.println(":");
		result.generateresult();
	   
	}

}
