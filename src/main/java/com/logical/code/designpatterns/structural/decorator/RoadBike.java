package com.logical.code.designpatterns.structural.decorator;

public class RoadBike extends Bike {

	public RoadBike(String name) {
		super(name);
		setPrice(50000);
	}

	@Override
	protected void showDetails() {
		System.out.println("Cost of " + getName() + " : " + getPrice());
	}
}
