package com.logical.code.designpatterns.structural.decorator.first;

public class DecoratorPatternTest {

	public static void main(String[] args) {

		Bike bike = new RoadBike("HERO");
		bike.showDetails();
		System.out.println("------------------------------------------");
		BikeDecorator bikeDecorator = new AlarmBikeDecorator(new RoadBike("HERO"));
		bikeDecorator.showDetails();
		System.out.println("------------------------------------------");
		bikeDecorator = new AlarmBikeDecorator(new ElectricBikeDecorator(new RoadBike("HERO")));
		bikeDecorator.showDetails();
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		bike = new MountainBike("FCZ");
		bike.showDetails();
		System.out.println("------------------------------------------");
		bikeDecorator = new AlarmBikeDecorator(new MountainBike("FCZ"));
		bikeDecorator.showDetails();
		System.out.println("------------------------------------------");
		bikeDecorator = new AlarmBikeDecorator(new ElectricBikeDecorator(new MountainBike("FCZ")));
		bikeDecorator.showDetails();
	}

}
