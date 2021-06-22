package com.logical.code.designpatterns.structural.decorator;

public abstract class BikeDecorator extends Bike {

	protected Bike bike;

	public BikeDecorator(Bike bike) {
		this.bike = bike;
		setName(bike.getName() + " " + addFeatureName());
		setPrice(bike.getPrice() + addFeaturePrice());
	}

	protected abstract int addFeaturePrice();

	protected abstract String addFeatureName();

	@Override
	protected void showDetails() {
		bike.showDetails();
		System.out.println("Cost of " + getName() + " : " + getPrice());
	}
}
