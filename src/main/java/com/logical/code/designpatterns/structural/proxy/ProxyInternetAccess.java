package com.logical.code.designpatterns.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	String employeeName;

	private RealInternetAccess realInternetAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {

		if (getRole(employeeName) > 4) {
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String emplName) {
		return 9;
	}

}
