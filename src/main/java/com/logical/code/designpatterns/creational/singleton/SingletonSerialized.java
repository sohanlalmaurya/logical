package com.logical.code.designpatterns.creational.singleton;

import java.io.Serializable;

public class SingletonSerialized implements Serializable {

	private static final long serialVersionUID = 1528745727165512812L;

	private SingletonSerialized() {
	}

	private static class SingletonHelper {
		private static final SingletonSerialized INSTANCE = new SingletonSerialized();
	}

	public static SingletonSerialized getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	private Object readResolve()  {
	    return SingletonHelper.INSTANCE;
	}
}
