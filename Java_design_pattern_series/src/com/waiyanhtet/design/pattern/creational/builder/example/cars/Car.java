package com.waiyanhtet.design.pattern.creational.builder.example.cars;

import com.waiyanhtet.design.pattern.creational.builder.example.components.Engine;
import com.waiyanhtet.design.pattern.creational.builder.example.components.GPSNavigator;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Transmission;
import com.waiyanhtet.design.pattern.creational.builder.example.components.TripComputer;

public class Car {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator navigator;
	private double fuel = 0;

	public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator navigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		
		if(this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
		
		this.navigator = navigator;
	}

	public CarType getType() {
		return type;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getNavigator() {
		return navigator;
	}

	public double getFuel() {
		return fuel;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

}
