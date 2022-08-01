package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.builder.example.builders.CarBuilder;
import com.waiyanhtet.design.pattern.creational.builder.example.builders.CarManualBuilder;
import com.waiyanhtet.design.pattern.creational.builder.example.cars.Car;
import com.waiyanhtet.design.pattern.creational.builder.example.cars.Manual;
import com.waiyanhtet.design.pattern.creational.builder.example.director.Director;

public class BuilderExampleTest {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder carBuilder = new CarBuilder();
		director.constructSportsCar(carBuilder);
		Car car = carBuilder.getResult();
		System.out.println("Car built : \n" + car.getType());
		car.getEngine().on();
		car.getTripComputer().showFuelLevel();
		car.getTripComputer().showStatus();
		
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSUV(manualBuilder);		
		Manual manual = manualBuilder.getResult();
		System.out.println("\nCar manual built : \n" + manual.print());
	}
}
