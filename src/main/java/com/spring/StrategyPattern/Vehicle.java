package com.spring.StrategyPattern;

import com.spring.StrategyPattern.DriveStrategy.DriveStrategy;

public class Vehicle {
	/* Wrong or incorrect implementation now
	DriveStrategy driveStrategy = new NormalDrive(); */
	
	DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}

}
