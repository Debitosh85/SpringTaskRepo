package com.nit.spring;

public class Course {
	
	private int courseId;
	private String courseName;
	private int duration;
	
	public Course(int courseId,String courseName,int duration)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return " [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
}
