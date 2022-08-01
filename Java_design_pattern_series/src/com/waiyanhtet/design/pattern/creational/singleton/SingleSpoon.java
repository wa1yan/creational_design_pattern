package com.waiyanhtet.design.pattern.creational.singleton;

public class SingleSpoon {
	
	private static SingleSpoon spoon;
	private static boolean theSingleSpoonIsAvailable = true;
	
	private SingleSpoon() {

	}
	
	public static SingleSpoon getSpoon() {
		if(theSingleSpoonIsAvailable) {
			if(spoon == null) {
				spoon = new SingleSpoon();
			}
			theSingleSpoonIsAvailable = false;
		} else {
			return null;
		}
		
		return spoon;
	}

	public static void returnTheSpoon() {
		theSingleSpoonIsAvailable = true;
		System.out.println("Spoon can get.");
	}
	

}
