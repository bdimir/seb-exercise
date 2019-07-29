package seb.domain.products;

import java.util.ArrayList;
import java.util.List;
import seb.domain.rules.IProductRule;
import seb.models.dto.PersonAnswers;

public abstract class ProductBase implements IProduct {

	protected List<IProductRule> ProductRules;

	public ProductBase() {
		ProductRules = new ArrayList<IProductRule>();
	}

	public abstract String GetName();

	public boolean IsValid(PersonAnswers personAnswers) {
		for (IProductRule rule : ProductRules) {
			if (!rule.IsApplicable(personAnswers)) {
				return false;
			}
		}
		return true;
	}

}
