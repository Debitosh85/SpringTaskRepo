package com.nit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospitalService {
	
	@Autowired
	Doctor doctor;
	@Autowired
	Patient patient;
	@Autowired
	Billing billing;
	
	public HospitalService(Doctor doctor,Patient patient,Billing billing) {
		this.doctor = doctor;
		this.patient = patient;
		this.billing = billing;
	}
	
	public void generateHospitalBill()
	{
		System.out.println("Consultation Fee:"+billing.getConsultationFee());
		System.out.println("Medicine Charge:"+billing.getMedicineCharge());
		System.out.println("Room Charge:"+billing.getRoomCharges());
	}
	
	public void showSummary() {
		System.out.println("Doctor's Name:"+doctor.getDoctorName());
		System.out.println("Doctor's Id:"+doctor.getDoctorId());
		System.out.println("Specialist:"+doctor.getSpecialization());
		System.out.println(".........................................");
		System.out.println("Name of the Patient:"+patient.getPatientName());
		System.out.println("Id of the Patient:"+patient.getPatientId());
		System.out.println("Affected In:"+patient.getDisease());
		System.out.println("Total Bill Paid by Patient:");
		System.out.println("-----------------------------");
		System.out.println("                     "+billing.calculateTotal());
		System.out.println("Bill Generated Successfully");
	}
	

}
