package com.logical.code.abstraction;

public class AbstractTestClass {
	
	public static void main(String[] args) {
		
		AbstractClass abstractClass = new AbstractClass(10) {
			
		};
		
		System.out.println(abstractClass.value);
	}
}
