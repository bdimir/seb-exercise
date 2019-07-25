package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;


public class GoldCreditCardProduct extends ProductBase {

	public GoldCreditCardProduct(List<IProductRule> productRules) {
		ProductRules = productRules;
	}

	@Override
	public String GetName() {
		return ProductNames.GoldCreditCard;
	}

}