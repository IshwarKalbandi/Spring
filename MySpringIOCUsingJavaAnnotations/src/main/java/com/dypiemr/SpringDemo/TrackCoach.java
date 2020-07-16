package com.dypiemr.SpringDemo;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TrackCoach implements Coach {

	
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return("Run 5 km");
	}

}
