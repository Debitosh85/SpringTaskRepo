package com.nit.spring;

public class NotificationManager {
	
	NotificationService service;
	
	public void setService(NotificationService service) {
		this.service = service;
	}
	
	public void NotifyManage(String msg) {
		service.sendNotification(msg);
	}

}
