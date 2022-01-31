package com.logical.code.corejava.immutable.second;


public class Employee2 {

	private final String name;
	private final int age;
	private final Address2 address;

	public Employee2(String name, int age, Address2 address) {
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

	public Address2 getAddress() {
		Address2 newAddress = new Address2();
		newAddress.setAddress(address.getAddress());
		newAddress.setAddressType(address.getAddressType());
		newAddress.setCity(address.getCity());
		return newAddress;
	}
}
