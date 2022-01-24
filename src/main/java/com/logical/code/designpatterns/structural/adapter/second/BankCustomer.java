package com.logical.code.designpatterns.structural.adapter.second;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void getBankDetails() {
		setAccHolderName("SOHAN LAL MAURYA");
		setAccNumber(1234);
		setBankName("SBI");

	}

	@Override
	public String getCreditCard() {
		return ("The Account number " + getAccNumber() + " of " + getAccHolderName() + " in " + getBankName()
				+ " bank is valid and authenticated for issuing the credit card. ");
	}

}
