package com.waiyanhtet.design.pattern.creational.abstractFactory.factory;

import com.waiyanhtet.design.pattern.creational.abstractFactory.model.Computer;
import com.waiyanhtet.design.pattern.creational.abstractFactory.model.PC;

public class ServerFactory implements ComputerAbstractFactory {

	private String RAM;
	private String HDD;
	private String CPU;

	public ServerFactory(String rAM, String hDD, String cPU) {
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}

}
