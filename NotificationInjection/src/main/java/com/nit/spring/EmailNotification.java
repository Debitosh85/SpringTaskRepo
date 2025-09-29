package com.nit.spring;

public class EmailNotification implements NotificationService {
	
	public void sendNotification( String msg) {
		
		System.out.println("Sending Email Notification::"+msg);
		
	}

}
