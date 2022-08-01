package com.waiyanhtet.design.pattern.creational.builder.example.builders;

import com.waiyanhtet.design.pattern.creational.builder.example.cars.CarType;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Engine;
import com.waiyanhtet.design.pattern.creational.builder.example.components.GPSNavigator;
import com.waiyanhtet.design.pattern.creational.builder.example.components.Transmission;
import com.waiyanhtet.design.pattern.creational.builder.example.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);
	void setSeats(int seat);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer computer);
	void setGPSNavigator(GPSNavigator navigator);
	
}
