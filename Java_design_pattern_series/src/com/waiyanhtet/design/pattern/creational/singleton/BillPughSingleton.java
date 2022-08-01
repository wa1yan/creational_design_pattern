package com.waiyanhtet.design.pattern.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {

	}

	/*
	 * This is the most widely used approach for Singleton class
	 * When the singleton class is loaded, SingletonHelper class is not loaded into
	 * memory and only when someone calls the getInstance method, this class gets
	 * loaded and creates the Singleton class instance.
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
