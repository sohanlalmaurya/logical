package com.logical.code.designpatterns.creational.factory;

public abstract class Plan {

	protected double rate;
	
	protected abstract void getRate();
	
	public void bill(Integer units) {
		System.out.println("Bill = "+(units*rate));
	}
}
