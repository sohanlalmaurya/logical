package com.logical.code.corejava.immutable.first;

public class Employee {
	private final String name;
	private final int age;
	private final Address address;

	public Employee(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
}
