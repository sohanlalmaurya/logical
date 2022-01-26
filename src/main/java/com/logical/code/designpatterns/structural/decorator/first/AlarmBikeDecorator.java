package com.logical.code.designpatterns.structural.decorator.first;

public class AlarmBikeDecorator extends BikeDecorator {

	protected Bike bike;

	public AlarmBikeDecorator(Bike bike) {
		super(bike);
		this.bike = bike;
	}

	@Override
	protected void showDetails() {
		System.out.println("Cost of " + getName() + " : " + getPrice());
	}

	@Override
	protected int addFeaturePrice() {

		return 10000;
	}

	@Override
	protected String addFeatureName() {

		return "Alarm";
	}
}
