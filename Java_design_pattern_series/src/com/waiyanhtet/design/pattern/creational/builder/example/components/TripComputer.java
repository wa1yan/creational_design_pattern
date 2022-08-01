package com.waiyanhtet.design.pattern.creational.builder.example.components;

import com.waiyanhtet.design.pattern.creational.builder.example.cars.Car;

public class TripComputer {

	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void showFuelLevel() {
		System.out.println("Fuel level : " + this.car.getFuel());
	}
	
	public void showStatus() {
		if(this.car.getEngine().isStarted()) {
			System.out.println("Car is started");
		} else {
			System.out.println("Car isn't started");
		}
	}
}
