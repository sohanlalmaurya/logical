package com.logical.code.designpatterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		EmployeeRecord e1 = new EmployeeRecord("Sohan", 33, 5000000);

		e1.showRecord();
		System.out.println();
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	}
}
