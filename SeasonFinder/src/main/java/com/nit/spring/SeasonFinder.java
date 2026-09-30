package com.nit.spring;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Season")
public class SeasonFinder {
	
	@Autowired
	public LocalDate lt;
	
	public void getSeason() {
		Month month = lt.getMonth();
		String season;
		
		if(month ==Month.JANUARY || month==Month.APRIL) {
			season ="Rainy season";
		}else if(month==Month.MAY || month==Month.AUGUST) {
			season="Summer Season";
		}else {
			season ="Winter Season";
		}
		System.out.println("Month is:"+month+"Season is::"+season);
	}
}

