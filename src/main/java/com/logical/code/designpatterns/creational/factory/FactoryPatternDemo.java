package com.logical.code.designpatterns.creational.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		GetPlanFactory factory = new GetPlanFactory();
		
		Plan domesticPlan = factory.getPlan("DOMESTIC_PLAN");
		domesticPlan.getRate();
		domesticPlan.bill(2);
		
		Plan commercialPlan = factory.getPlan("COMMERCIAL_PLAN");
		commercialPlan.getRate();
		commercialPlan.bill(2);
		
		Plan institutionalPlan = factory.getPlan("INSTITUTIONAL_PLAN");
		institutionalPlan.getRate();
		institutionalPlan.bill(2);
		
	}
}
