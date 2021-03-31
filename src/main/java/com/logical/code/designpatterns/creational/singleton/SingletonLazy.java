package com.logical.code.designpatterns.creational.singleton;

public class SingletonLazy {

	private static SingletonLazy instance = null;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {

		synchronized (SingletonLazy.class) {
			if (instance == null) {
				instance = new SingletonLazy();
			}
		}
		return instance;
	}
}
