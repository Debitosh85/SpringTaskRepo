 package com.nit.spring;

public class SmsNotification implements NotificationService{
	
	public void sendNotification(String msg) {
		System.out.println("Sending sms Notication: "+msg);
	}

}
