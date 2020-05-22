package com.logical.code.designpatterns.structural.bridge;

public class BridgePattern {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
		
		Integer grade = 33, temp = grade/5; 
        temp = temp*5 + 5;
        if(temp-grade<3 && temp-grade>2)
            System.out.println(temp);
        else
        	System.out.println(grade);
	}
}
