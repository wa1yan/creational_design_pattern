package com.waiyanhtet.design.pattern.creational.builder.sample;

public class PCBuilder {

	private String HDD;
	private String RAM;

	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;

	private PC pc;
	
	public PCBuilder() {
		this.pc = new PC();
	}

	public PCBuilder setHDD(String hDD) {
		pc.setHDD(hDD);
		return this;
	}

	public PCBuilder setRAM(String rAM) {
		pc.setRAM(rAM);
		return this;
	}

	public PCBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
		pc.setGraphicCardEnabled(isGraphicCardEnabled);
		return this;
	}

	public PCBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		pc.setBluetoothEnabled(isBluetoothEnabled);
		return this;
	}
	
	public PC build() {
		return pc;
	}

}
