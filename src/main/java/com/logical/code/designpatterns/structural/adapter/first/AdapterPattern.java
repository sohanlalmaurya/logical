package com.logical.code.designpatterns.structural.adapter.first;

public class AdapterPattern {

	public static void main(String[] args) {

		Bird bird = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();

		ToyDuck birdAdapter = new BirdAdapter(bird);

		System.out.println("Sparrow...");
		bird.fly();
		bird.makeSound();

		System.out.println("ToyDuck...");
		toyDuck.squeak();

		// toy duck behaving like a bird
		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
	}
}
