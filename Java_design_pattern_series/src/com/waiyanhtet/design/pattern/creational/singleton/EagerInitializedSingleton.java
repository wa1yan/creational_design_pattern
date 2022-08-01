package com.waiyanhtet.design.pattern.creational.singleton;

public class EagerInitializedSingleton {

	private static EagerInitializedSingleton instanceEager = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return instanceEager;
	}
	
	public String getMessage() {
		return "Singleton";
	}
	
}
