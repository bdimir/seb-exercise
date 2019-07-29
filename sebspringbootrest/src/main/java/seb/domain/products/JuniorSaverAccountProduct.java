package seb.domain.products;

import seb.domain.rules.AgeLessThan18Rule;

public class JuniorSaverAccountProduct extends ProductBase {

	public JuniorSaverAccountProduct(AgeLessThan18Rule rule1) {
		ProductRules.add(rule1);
	}

	@Override
	public String GetName() {
		return ProductNames.JuniorSaverAccount;
	}

}
