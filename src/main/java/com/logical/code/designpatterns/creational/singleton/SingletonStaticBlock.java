package com.logical.code.designpatterns.creational.singleton;

public class SingletonStaticBlock {

	private static SingletonStaticBlock instance;

	// private constructor to avoid client applications to use constructor
	private SingletonStaticBlock() {
	}

	static {
		try {
			instance = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static SingletonStaticBlock getInstance() {
		return instance;
	}
}
