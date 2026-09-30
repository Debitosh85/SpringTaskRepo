package com.nit.spring;

import java.util.Arrays;

public class Student {
	
	private int id;
	private String name;
	private String course;
	private int marks[];
	private int sum;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}

	private int avg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public int calculateAverage() {
		
		for(int i=0;i<marks.length;i++) {
			
			sum+=marks[i];
			
			avg= sum/marks.length;
		}
		return avg;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + Arrays.toString(marks)
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	

}
