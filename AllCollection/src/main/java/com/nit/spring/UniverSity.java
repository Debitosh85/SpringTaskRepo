package com.nit.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniverSity {
	
	List<String> name;
	
	Map<String,Integer> dept;
	
	Set<String> subjects;
	
	
	public void setName(List<String>name) {
		this.name = name;
	}
	
	public void setDept(Map<String,Integer>dept) {
		this.dept = dept;
	}
	
	public void setSubjects(Set<String>subjects) {
		this.subjects = subjects;
	}
	
	public void showDetails() {
		
		System.out.println("Students Enrolled in this University:"+name);
		System.out.println("Department and DepartMent Id:"+dept);
		System.out.println("Subjects taken by Students:"+subjects);
	}

}
