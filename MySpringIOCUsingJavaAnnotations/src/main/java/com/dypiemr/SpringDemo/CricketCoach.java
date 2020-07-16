package com.dypiemr.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return("Spend 3 hours in Cricket Practice");
	}

}
