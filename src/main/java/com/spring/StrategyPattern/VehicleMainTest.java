package com.spring.StrategyPattern;

public class VehicleMainTest {

	public static void main(String[] args) {
		
		Vehicle goodsVehicle = new GoodsVehicle();
		goodsVehicle.drive();
		
		Vehicle racingVehicle = new SportsVehicle();
		racingVehicle.drive();

	}

}
