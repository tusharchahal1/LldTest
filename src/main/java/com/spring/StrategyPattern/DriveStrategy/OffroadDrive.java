package com.spring.StrategyPattern.DriveStrategy;

public class OffroadDrive implements DriveStrategy {

	@Override
	public void drive() {
		
		System.out.println("It is a off road drive");
	}

}
