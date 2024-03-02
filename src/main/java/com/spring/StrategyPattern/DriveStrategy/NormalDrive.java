package com.spring.StrategyPattern.DriveStrategy;

public class NormalDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("It is a normal drive");

	}

}
