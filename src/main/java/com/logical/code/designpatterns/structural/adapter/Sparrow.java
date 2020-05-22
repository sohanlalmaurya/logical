package com.logical.code.designpatterns.structural.adapter;

public class Sparrow implements Bird {

	@Override
	public void fly() {
		System.out.println("FLYING");

	}

	@Override
	public void makeSound() {
		System.out.println("Chirp chirp");

	}

}
