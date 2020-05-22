package com.logical.code.designpatterns.structural.adapter;

public class BirdAdapter implements ToyDuck {

	Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	@Override
	public void squeak() {
		bird.makeSound();
	}

}
