package com.nit.spring;

public class Student {
	
	private int studentId;
	private String studentName;
	private Course course;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}
}
