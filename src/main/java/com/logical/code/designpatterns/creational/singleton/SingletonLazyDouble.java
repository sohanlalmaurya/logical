package com.logical.code.designpatterns.creational.singleton;

public class SingletonLazyDouble {

	private static SingletonLazyDouble instance = null;

	private SingletonLazyDouble() {

	}

	public static SingletonLazyDouble getInstance() {
		if (instance == null) {
			synchronized (SingletonLazyDouble.class) {
				if (instance == null) {
					instance = new SingletonLazyDouble();
				}
			}
		}
		return instance;
	}
}
