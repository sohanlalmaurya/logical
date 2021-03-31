package com.logical.code.designpatterns.creational.singleton;

public class SingletonEager {
	
	private static SingletonEager instance = null;
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		if(instance == null) {
			instance = new SingletonEager();
		}
		return instance;
	}
}
