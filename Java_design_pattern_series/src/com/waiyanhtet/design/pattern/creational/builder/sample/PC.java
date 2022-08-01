package com.waiyanhtet.design.pattern.creational.builder.sample;

public class PC {

	private String HDD;
	private String RAM;

	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	protected PC() {

	}

	public void setHDD(String HDD) {
		this.HDD = HDD;
	}

	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	public void setGraphicCardEnabled(boolean isGraphicCardEnabled) {
		this.isGraphicCardEnabled = isGraphicCardEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public PC(String hDD, String rAM, boolean isGraphicCardEnabled, boolean isBluetoothEnabled) {
		this.HDD = hDD;
		this.RAM = rAM;
		this.isGraphicCardEnabled = isGraphicCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "PC [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnabled=" + isGraphicCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
