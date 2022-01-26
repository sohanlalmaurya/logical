package com.logical.code.designpatterns.structural.proxy;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Sohan Lal Maurya");
		access.grantInternetAccess();
	}
}
