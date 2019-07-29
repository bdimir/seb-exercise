package seb.product;

import java.util.List;

import seb.domain.rules.IProductRule;
import seb.models.dto.PersonAnswers;

public class Product implements IProduct {

	private List<IProductRule> ProductRules;
	private String ProductName;

	public Product(String nameOfProduct, List<IProductRule> rules) {
		ProductName = nameOfProduct;
		ProductRules = rules;
	}

	public String GetName() {
		return ProductName;
	}

	public boolean IsValid(PersonAnswers personAnswers) {
		for (IProductRule rule : ProductRules) {
			if (!rule.IsApplicable(personAnswers)) {
				return false;
			}
		}
		return true;
	}
}
