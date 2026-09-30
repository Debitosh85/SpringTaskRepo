package com.nit.spring;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String specialization;
	

	public Doctor(int doctorId,String doctorName,String specialization) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	
	public int getDoctorId() {
		return doctorId;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void displayDoctorInfo() {
		System.out.println("Id of Doctor"+doctorId);
		System.out.println("Name of the Doctor:"+doctorName);
		System.out.println("Specialist of:"+specialization);
	}
}
