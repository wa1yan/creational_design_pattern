package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.factory.ComputerFactory;
import com.waiyanhtet.design.pattern.creational.factory.model.Computer;

public class FactoryTest {

	public static void main(String[] args) {
		Computer server = ComputerFactory.getComputer("Server", "4 GB", "500 GB", "Core i3");
		Computer server2 = ComputerFactory.getComputer("Server", "4 GB", "500 GB", "Core i3");
		Computer pc = ComputerFactory.getComputer("PC", "4 GB", "500 GB", "Core i3");

		System.out.println("PC = " + pc.toString());
		System.out.println("Server = " + server.toString());
		
		System.out.println(server.hashCode());
		System.out.println(server2.hashCode());
		System.out.println(pc.hashCode());
	}
}
