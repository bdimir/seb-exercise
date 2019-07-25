package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;

public class CurrentAccountProduct extends ProductBase {
	
	public CurrentAccountProduct(List<IProductRule> productRules)
    {
        ProductRules = productRules;
    }

	@Override
	public String GetName() {
		return ProductNames.CurrentAccount;
	}
}
