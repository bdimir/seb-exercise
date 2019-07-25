package seb.domain.products;

import java.util.List;
import seb.domain.rules.IProductRule;

public class StudentAccountProduct extends ProductBase {

	public StudentAccountProduct(List<IProductRule> productRules) {
		ProductRules = productRules;
	}

	@Override
	public String GetName() {
		return ProductNames.StudentAccount;
	}

}
