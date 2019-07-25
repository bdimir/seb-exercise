package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;


public class DebitCardProduct extends ProductBase {

	public DebitCardProduct(List<IProductRule> productRules) {
		ProductRules = productRules;
	}

	@Override
	public String GetName() {
		return ProductNames.DebitCard;
	}

}