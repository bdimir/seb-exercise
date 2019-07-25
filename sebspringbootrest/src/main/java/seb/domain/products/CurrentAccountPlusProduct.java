package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;

public class CurrentAccountPlusProduct extends ProductBase {
	
	public CurrentAccountPlusProduct(List<IProductRule> productRules)
    {
        ProductRules = productRules;
    }

	@Override
	public String GetName() {
		return ProductNames.CurrentAccountPlus;
	}
}