package com.logical.code.designpatterns.creational.singleton;

public class SingletonBillPugh {

	private SingletonBillPugh() {

	}

	private static class SinglotenHelper {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {

		return SinglotenHelper.INSTANCE;
	}
}
