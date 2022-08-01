package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.abstractFactory.ComputerFactory;
import com.waiyanhtet.design.pattern.creational.abstractFactory.factory.PCFactory;
import com.waiyanhtet.design.pattern.creational.abstractFactory.factory.ServerFactory;
import com.waiyanhtet.design.pattern.creational.abstractFactory.model.Computer;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		Computer pc1 = factory.getComputer(new PCFactory("4GB", "500GB", "Core i3"));
		Computer pc2 = factory.getComputer(new PCFactory("4GB", "500GB", "Core i3"));
		System.out.println(pc1 == pc2);
		System.out.println("PC = " + pc1.toString());

		Computer server = factory.getComputer(new ServerFactory("4GB", "500GB", "Core i3"));
		System.out.println("Server = " + server.toString());
	}
}
