package com.logical.code.designpatterns.behavioral.template;

public class Football extends Game {
	
	@Override
	void endPlay() {
		System.out.println("Footboll Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Footboll Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Footboll Game Started. Enjoy the game!");
	}
}
