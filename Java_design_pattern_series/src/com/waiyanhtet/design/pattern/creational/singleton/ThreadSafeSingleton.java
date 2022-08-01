package com.waiyanhtet.design.pattern.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	private String message;

	private ThreadSafeSingleton() {
		message = "Thread Safe Singleton";
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeSingleton.class) { //this is double checking
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}

	public String getMessage() {
		return message;
	}
}
