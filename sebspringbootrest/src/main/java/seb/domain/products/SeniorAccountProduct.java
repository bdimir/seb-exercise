package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;


public class SeniorAccountProduct extends ProductBase {

	public SeniorAccountProduct(List<IProductRule> productRules) {
		ProductRules = productRules;
	}

	@Override
	public String GetName() {
		return ProductNames.SeniorAccount;
	}

}