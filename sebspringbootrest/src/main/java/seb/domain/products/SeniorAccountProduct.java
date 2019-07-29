package seb.domain.products;

import seb.domain.rules.*;

public class SeniorAccountProduct extends ProductBase {

	public SeniorAccountProduct(Age65PlusRule rule) {
		ProductRules.add(rule);
	}

	@Override
	public String GetName() {
		return ProductNames.SeniorAccount;
	}

}