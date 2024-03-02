package com.spring.StrategyPattern;

import com.spring.StrategyPattern.DriveStrategy.NormalDrive;

public class GoodsVehicle extends Vehicle{

	public GoodsVehicle() {
		super(new NormalDrive());
	}

}
