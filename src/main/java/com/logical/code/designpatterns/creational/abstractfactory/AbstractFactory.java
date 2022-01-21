package com.logical.code.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {

	protected abstract Bank getBank(String bankName);
	protected abstract Loan getLoan(String loanName);
}
