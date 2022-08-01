package com.waiyanhtet.design.pattern.creational.abstractFactory;

import com.waiyanhtet.design.pattern.creational.abstractFactory.factory.ComputerAbstractFactory;
import com.waiyanhtet.design.pattern.creational.abstractFactory.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
