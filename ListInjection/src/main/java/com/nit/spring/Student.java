package com.nit.spring;

import java.util.List;

public class Student {
	
	List<String> subjects;
	
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void ShowBook() {
		System.out.println("This Subjects are available:"+subjects);
	}

}
