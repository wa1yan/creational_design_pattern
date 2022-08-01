package com.waiyanhtet.design.pattern.creational.singleton;

public class LazyInitializedSingleton {

	private static  LazyInitializedSingleton instance;
	private String message;
	
	private LazyInitializedSingleton() {
		message = "Lazy Initialized Singleton";
	}
	
	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	public String getMessage() {
		return message;
	}
}
