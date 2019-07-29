package seb.domain.products;

import seb.domain.rules.AgeOver17Rule;
import seb.domain.rules.IncomeMoreThanZeroRule;

public class CurrentAccountProduct extends ProductBase {
	
	public CurrentAccountProduct(IncomeMoreThanZeroRule rule1, AgeOver17Rule rule2)
    {
        ProductRules.add(rule1);
        ProductRules.add(rule2);
    }

	@Override
	public String GetName() {
		return ProductNames.CurrentAccount;
	}
}
