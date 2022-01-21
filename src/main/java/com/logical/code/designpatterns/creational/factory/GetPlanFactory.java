package com.logical.code.designpatterns.creational.factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTIC_PLAN")) {
			return new DomasticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIAL_PLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONAL_PLAN")) {
			return new InstitutionalPlan();
		}

		return null;
	}
}
