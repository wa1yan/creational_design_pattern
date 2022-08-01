package com.waiyanhtet.design.pattern.creational.builder.example.cars;

import com.waiyanhtet.design.pattern.creational.builder.example.components.Engine;
import com.waiyanhtet.design.pattern.creational.builder.example.components.GPSNavigator;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Transmission;
import com.waiyanhtet.design.pattern.creational.builder.example.components.TripComputer;

public class Manual {

	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator navigator;

	public Manual(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator navigator) {
		super();
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.navigator = navigator;
	}

	public String print() {
		String info = "";

		info += "Type of car :" + type + "\n";
		info += "Count of seat :" + seats + "\n";
		info += "Engine : volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
		info += "Transmission : " + transmission + "\n";
		
		if (this.tripComputer != null) {
			info += "TripComputer : Functional \n" ;

		} else {
			info += "TripComputer : N/A \n";
		}

		if (this.navigator != null) {
			info += "GPS navigator : Functional \n";
		} else {
			info += "GPS navigator : N/A \n";
		}
		
		//info += "Fuel level : " + tripComputer.showStatus() + "\n";

		return info;
	}
}
