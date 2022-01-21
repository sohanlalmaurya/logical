package com.logical.code.designpatterns.creational.abstractfactory;

public class HDFCBank implements Bank {

	private final String BNAME;

	public HDFCBank() {

		BNAME = "HDFC BANK";
	}

	@Override
	public String getBankName() {

		return BNAME;
	}

}
