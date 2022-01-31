package com.logical.code.corejava.immutable.first;

public class ImmutableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee("SOHAN", 32, new Address("OFFICE", "ABC", "GKP"));
		System.out.println(employee);
		Address address = employee.getAddress();
		System.out.println(address);
		
//		address.getAddressType();
//		address.getAddress();
//		address.getCity();
//		
//		System.out.println(address.getAddress());
//		System.out.println(employee);
//		
		address.setAddressType("REGIDENTIALS");
		address.setAddress("PANIYRA");
		address.setCity("MAHARAJGANJ");
		
		System.out.println(employee.getAddress());
		System.out.println(employee);
	}
}
