package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	private LocalDate date;
	
	//int month = date.getMonthValue();
	public String getMonth() {
		int month = date.getMonthValue();
		
		if(month>=3&&month<=6) {
			return "winter Season";
			
		}else if(month>=7&&month<=9) {
			return "Summer Season";
			
		}else {
			return "Rainy Season";
		}
	}
}
