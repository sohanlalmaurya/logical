package com.logical.code.designpatterns.structural.decorator;

public class ElectricBikeDecorator extends BikeDecorator {

	protected Bike bike;

	public ElectricBikeDecorator(Bike bike) {
		super(bike);
		this.bike = bike;
	}

	@Override
	protected void showDetails() {
		System.out.println("Cost of " + getName() + " : " + getPrice());
	}

	@Override
	protected int addFeaturePrice() {

		return 11000;
	}

	@Override
	protected String addFeatureName() {

		return "Electric";
	}
}
