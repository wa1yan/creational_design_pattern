package com.waiyanhtet.design.pattern.creational.builder.example.builders;

import com.waiyanhtet.design.pattern.creational.builder.example.cars.Car;
import com.waiyanhtet.design.pattern.creational.builder.example.cars.CarType;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Engine;
import com.waiyanhtet.design.pattern.creational.builder.example.components.GPSNavigator;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Transmission;
import com.waiyanhtet.design.pattern.creational.builder.example.components.TripComputer;

public class CarBuilder implements Builder {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator navigator;

	@Override
	public void setCarType(CarType type) {
		this.type = type;

	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;

	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;

	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;

	}

	@Override
	public void setTripComputer(TripComputer computer) {
		this.tripComputer = computer;

	}

	@Override
	public void setGPSNavigator(GPSNavigator navigator) {
		this.navigator = navigator;

	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, navigator);
	}
}
