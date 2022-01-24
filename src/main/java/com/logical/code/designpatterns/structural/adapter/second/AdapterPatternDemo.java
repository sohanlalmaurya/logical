package com.logical.code.designpatterns.structural.adapter.second;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		CreditCard card = new BankCustomer();
		card.getBankDetails();
		System.out.println(card.getCreditCard());
	}
}
