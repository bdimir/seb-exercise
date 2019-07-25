package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;



public class CreditCardProduct extends ProductBase {

	public CreditCardProduct(List<IProductRule> productRules) {
		ProductRules = productRules;
	}

	@Override
	public String GetName() {
		return ProductNames.CreditCard;
	}

}