package com.logical.code.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflectionTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		SingletonLazy instanceOne = SingletonLazy.getInstance();
		SingletonLazy instanceTwo = null;
		try {
			Constructor[] constructors = SingletonLazy.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (SingletonLazy) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
