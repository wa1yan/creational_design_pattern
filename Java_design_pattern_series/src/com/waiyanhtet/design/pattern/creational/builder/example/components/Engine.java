package com.waiyanhtet.design.pattern.creational.builder.example.components;

public class Engine {

	private final double volume;
	private double mileage;
	private boolean started;

	public Engine(double volume, double mileage) {
		this.volume = volume;
		this.mileage = mileage;
	}
	
	public void on() {
		started = true;
	}
	
	public void of() {
		started = false;
	}
	
	public void go(double mileage) {
		if(started) {
			this.mileage += mileage;
		} else {
			 System.err.println("Cannot go(), you must start engine first!");
		}
	}
	
	public boolean isStarted() {
		return started;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getMileage() {
		return mileage;
	}
}
