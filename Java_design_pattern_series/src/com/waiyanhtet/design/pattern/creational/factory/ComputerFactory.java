package com.waiyanhtet.design.pattern.creational.factory;

import com.waiyanhtet.design.pattern.creational.factory.model.Computer;
import com.waiyanhtet.design.pattern.creational.factory.model.PC;
import com.waiyanhtet.design.pattern.creational.factory.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if ("PC".equals(type)) {
			return new PC(hdd, ram, cpu);
		} else if ("Server".equals(type)) {
			return new Server(hdd, ram, cpu);
		}
		
		return null;
	}
}
