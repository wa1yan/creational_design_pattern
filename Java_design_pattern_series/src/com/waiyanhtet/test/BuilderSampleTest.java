package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.builder.sample.Computer;
import com.waiyanhtet.design.pattern.creational.builder.sample.PC;
import com.waiyanhtet.design.pattern.creational.builder.sample.PCBuilder;
import com.waiyanhtet.design.pattern.creational.builder.sample.Computer.ComputerBuilder;

public class BuilderSampleTest {

	public static void main(String[] args) {
		ComputerBuilder builder = new ComputerBuilder("500 GB", "4GB")
				.setGraphicCardEnabled(true)
				.setBluetoothEnabled(false);
		Computer computer = builder.build();
		//Computer pc = builder.build();
		System.out.println(computer.toString());
		
		PCBuilder pcBuilder = new PCBuilder()
				.setHDD("500 GB")
			//	.setRAM("4 GB")
				.setGraphicCardEnabled(true)
				.setBluetoothEnabled(false);

		PC pc1 = pcBuilder.build();
		System.out.println(pc1.toString());
		
	}
}
