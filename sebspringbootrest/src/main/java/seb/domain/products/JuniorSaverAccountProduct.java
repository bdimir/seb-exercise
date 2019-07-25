package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;

public class JuniorSaverAccountProduct extends ProductBase {

	public JuniorSaverAccountProduct(List<IProductRule> productRules)
    {
        ProductRules = productRules;
    }
	
	@Override
	public String GetName() {
		return ProductNames.JuniorSaverAccount;
	}

}
