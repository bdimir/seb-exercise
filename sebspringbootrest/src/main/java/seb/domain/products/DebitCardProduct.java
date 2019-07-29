package seb.domain.products;

import seb.domain.rules.*;

public class DebitCardProduct extends ProductBase {

	public DebitCardProduct(IncomeLessThan12KRule rule1, AgeOver17Rule rule2) {
		ProductRules.add(rule1);
		ProductRules.add(rule2);
	}

	@Override
	public String GetName() {
		return ProductNames.DebitCard;
	}

}