package seb.domain.products;

import seb.domain.rules.*;

public class CreditCardProduct extends ProductBase {

	public CreditCardProduct(IncomeMoreThan12KRule rule1, AgeOver17Rule rule2) {
		ProductRules.add(rule1);
		ProductRules.add(rule2);
	}

	@Override
	public String GetName() {
		return ProductNames.CreditCard;
	}

}