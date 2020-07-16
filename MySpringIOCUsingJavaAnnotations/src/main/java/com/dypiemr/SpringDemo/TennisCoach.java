package com.dypiemr.SpringDemo;

import org.springframework.stereotype.Component;
@Component
public class TennisCoach implements Coach {
	
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return("Spend 2 hours in Tennis Practice");
	}

}
