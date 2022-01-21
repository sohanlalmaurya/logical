package com.logical.code.designpatterns.creational.abstractfactory;

public class BankFactory extends AbstractFactory {

	@Override
	protected Bank getBank(String bankName) {
		if (bankName == null)
			return null;
		else if (bankName.equalsIgnoreCase("SBI"))
			return new SBIBank();
		else if (bankName.equalsIgnoreCase("HDFC"))
			return new SBIBank();
		else if (bankName.equalsIgnoreCase("Axis"))
			return new SBIBank();
		return null;
	}

	@Override
	protected Loan getLoan(String loanName) {
		// TODO Auto-generated method stub
		return null;
	}

}
