package com.logical.code.designpatterns.creational.abstractfactory;

public class AxisBank implements Bank {

	private final String BNAME;

	public AxisBank() {

		BNAME = "Axis BANK";
	}

	@Override
	public String getBankName() {

		return BNAME;
	}

}
