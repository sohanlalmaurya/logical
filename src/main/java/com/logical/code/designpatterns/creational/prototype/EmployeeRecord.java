package com.logical.code.designpatterns.creational.prototype;

public class EmployeeRecord implements Prototype {

	private String name;
	private Integer age;
	private Integer salary;

	public EmployeeRecord() {
	}

	public EmployeeRecord(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void showRecord() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("salary : "+salary);
	}
	
	@Override
	public Prototype getClone() {

		return new EmployeeRecord(name, age, salary);
	}

}
