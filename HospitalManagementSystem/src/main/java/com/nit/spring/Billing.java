package com.nit.spring;

import org.springframework.stereotype.Component;

@Component
public class Billing{
	
	private double consultationFee;
	private double medicineCharge;
	private double roomCharges;
	
	public Billing(double consultationFee,double medicineCharge,double roomCharges) {
		
		this.consultationFee = consultationFee;
		this.medicineCharge = medicineCharge ;
		this.roomCharges = roomCharges;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public double getMedicineCharge() {
		return medicineCharge;
	}

	public double getRoomCharges() {
		return roomCharges;
	}
	
	public double calculateTotal() {
		
	double totalBill = consultationFee + medicineCharge + roomCharges;
	
	return totalBill;
		
	}

}
