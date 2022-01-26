package com.logical.code.designpatterns.behavioral.mediator;

public class MediatorDesignPattern {
	
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
