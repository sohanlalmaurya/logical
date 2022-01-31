package com.logical.code.corejava.immutable.second;

public class ImmutableDemo2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 employee = new Employee2("SOHAN", 32, new Address2("OFFICE", "ABC", "GKP"));
		System.out.println(employee);
		Address2 address = employee.getAddress();
		System.out.println(address);
		
		address.getAddressType();
		address.getAddress();
		address.getCity();
		
		System.out.println(address.getAddress());
		System.out.println(employee);
		
		address.setAddressType("REGIDENTIALS");
		address.setAddress("PANIYRA");
		address.setCity("MAHARAJGANJ");
		
		System.out.println(employee.getAddress());
		System.out.println(employee);
	}
}
