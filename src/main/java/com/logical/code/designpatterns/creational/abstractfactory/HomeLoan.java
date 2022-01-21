package com.logical.code.designpatterns.creational.abstractfactory;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		super.rate = rate;

	}

}
