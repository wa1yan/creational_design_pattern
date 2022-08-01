package com.waiyanhtet.design.pattern.creational.builder.sample;

public class Computer {

	private String HDD;
	private String RAM;

	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder build) {
		this.HDD = build.HDD;
		this.RAM = build.RAM;
		this.isGraphicCardEnabled = build.isGraphicCardEnabled;
		this.isBluetoothEnabled = build.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnabled=" + isGraphicCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	public static class ComputerBuilder {
		private String HDD;
		private String RAM;

		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}

	}

}
