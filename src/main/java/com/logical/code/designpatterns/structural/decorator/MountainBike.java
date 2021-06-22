package com.logical.code.designpatterns.structural.decorator;

public class MountainBike extends Bike {

	public MountainBike(String name) {
		super(name);
		setPrice(70000);
	}

	@Override
	protected void showDetails() {
		System.out.println("Cost of " + getName() + " : " + getPrice());
	}
}
