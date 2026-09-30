package com.nit.spring;

public class EnrollmentService {
	
	private Student stud;
	
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public Student getStudent() {
		return stud;
	}
	
	public void enrollStudent() {
		
		System.out.println("StudentId :"+stud.getStudentId());
		System.out.println("StudentName:"+stud.getStudentName());
		System.out.println("Student Selected the Course:"+stud.getCourse());
		
	}

}
