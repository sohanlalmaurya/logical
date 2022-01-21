package com.logical.code.designpatterns.creational.abstractfactory;

public class SBIBank implements Bank {

	private final String BNAME;

	public SBIBank() {

		BNAME = "SBI BANK";
	}

	@Override
	public String getBankName() {

		return BNAME;
	}

}
