package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.singleton.EagerInitializedSingleton;
import com.waiyanhtet.design.pattern.creational.singleton.LazyInitializedSingleton;
import com.waiyanhtet.design.pattern.creational.singleton.SingleSpoon;
import com.waiyanhtet.design.pattern.creational.singleton.StaticBlockSingleton;
import com.waiyanhtet.design.pattern.creational.singleton.ThreadSafeSingleton;

public class SingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton eagerInstance1 = EagerInitializedSingleton.getInstance();
		System.out.println(eagerInstance1.getMessage());
		
		EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();
		System.out.println(eagerInstance2.getMessage());
		
		System.out.println(eagerInstance1 == eagerInstance2);
		
		StaticBlockSingleton staticInstance = StaticBlockSingleton.getInstance();
		System.out.println(staticInstance.getMessage());
		
		LazyInitializedSingleton lazyInstance = LazyInitializedSingleton.getInstance();
		System.out.println(lazyInstance.getMessage());
		
		ThreadSafeSingleton threadInstance = ThreadSafeSingleton.getInstance();
		System.out.println(threadInstance.getMessage());
		
		SingleSpoon spoonForFirstPerson = SingleSpoon.getSpoon();
		if(spoonForFirstPerson != null) {
			System.out.println("Spoon is using by Person 1");
		} else {
			System.out.println("Spoon is not available for Person 1");
		}
		
		spoonForFirstPerson.returnTheSpoon();
		
		SingleSpoon spoonForSecondPerson = SingleSpoon.getSpoon();
		if(spoonForSecondPerson != null) {
			System.out.println("Spoon is using by Person 2");
		} else {
			System.out.println("Spoon is not available for Person 2");
		}
		
		
	}
	
	
}
