package com.spring.StrategyPattern;

import com.spring.StrategyPattern.DriveStrategy.SportsDrive;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDrive());
		
	}

}
