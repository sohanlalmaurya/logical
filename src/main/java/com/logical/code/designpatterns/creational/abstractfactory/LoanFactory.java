package com.logical.code.designpatterns.creational.abstractfactory;

public class LoanFactory extends AbstractFactory {

	@Override
	protected Bank getBank(String bankName) {

		return null;
	}

	@Override
	protected Loan getLoan(String loanName) {
		if (loanName == null)
			return null;
		else if (loanName.equalsIgnoreCase("HOME"))
			return new HomeLoan();
		else if (loanName.equalsIgnoreCase("BUSSINESS"))
			return new BussinessLoan();
		else if (loanName.equalsIgnoreCase("EDUCATION"))
			return new EducationLoan();
		return null;
	}

}
