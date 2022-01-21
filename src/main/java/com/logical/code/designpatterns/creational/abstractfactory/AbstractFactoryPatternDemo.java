package com.logical.code.designpatterns.creational.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("BANK");  
		Bank bank=bankFactory.getBank("SBI"); 
		System.out.println(bank.getBankName());
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("LOAN");  
		Loan loan=loanFactory.getLoan("HOME");
		loan.getInterestRate(4);
		loan.calculateLoanPayment(1000, 2);
	}
}
