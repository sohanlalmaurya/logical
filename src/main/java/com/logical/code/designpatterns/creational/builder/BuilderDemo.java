package com.logical.code.designpatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Sohan", "Maurya").age(30).phone("1234567").address("address")
				.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Lal", "Maurya").age(40).phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man")
				// No age
				// No phone
				// no address
				.build();

		System.out.println(user3);
	}
}
