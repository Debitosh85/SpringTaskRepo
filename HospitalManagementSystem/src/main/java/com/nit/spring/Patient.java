package com.nit.spring;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	private int patientId;
	private String patientName;
	private String disease;
	
	public Patient(int patientId,String patientName,String disease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public String getDisease() {
		return disease;
	}

	public void patientInfo() {
		System.out.println("Id of Patient:"+patientId);
		System.out.println("Name of Patient:"+patientName);
		System.out.println("Disease affected by:"+disease);
	}
}
