package seb.domain.products;

import seb.domain.rules.*;

public class CurrentAccountPlusProduct extends ProductBase {

	public CurrentAccountPlusProduct(IncomeMoreThan40KRule rule1, AgeOver17Rule rule2) {
		ProductRules.add(rule1);
		ProductRules.add(rule2);
	}

	@Override
	public String GetName() {
		return ProductNames.CurrentAccountPlus;
	}
}