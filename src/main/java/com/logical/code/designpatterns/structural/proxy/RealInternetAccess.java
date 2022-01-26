package com.logical.code.designpatterns.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {

	String employeeName;

	public RealInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {

		System.out.println("Employee Name " + employeeName);
	}

}
