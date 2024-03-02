package com.spring.StrategyPattern.DriveStrategy;

public class SportsDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("It is a sports drive");

	}

}
