package com.waiyanhtet.design.pattern.creational.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	private String message;

	private StaticBlockSingleton() {
		message = "Static Block Singleton";
	}

	static {
		instance = new StaticBlockSingleton();
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

	public String getMessage() {
		return message;
	}
}
