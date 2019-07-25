package seb.repository.products;

import java.util.ArrayList;
import java.util.List;

import seb.domain.products.*;
import seb.domain.products.IProduct;
import seb.repository.rules.IProductRulesRepository;

public class ProductsRepository implements IProductsRepository {

	private IProductRulesRepository _rules;

	public ProductsRepository(IProductRulesRepository rules) {
		_rules = rules;
	}

	public List<IProduct> GetProducts() {

		List<IProduct> products = new ArrayList<IProduct>();
		products.add(new CurrentAccountProduct(List.of(_rules.getIncomeMoreThanZeroRule(), _rules.getAgeOver17Rule())));
		products.add(new CurrentAccountPlusProduct(List.of(_rules.getIncomeMoreThan40K(), _rules.getAgeOver17Rule())));
		products.add(new JuniorSaverAccountProduct(List.of(_rules.getAgeLessThan18Rule())));
		products.add(new StudentAccountProduct(List.of(_rules.getMustBeStudentRule(), _rules.getAgeOver17Rule())));
		products.add(new SeniorAccountProduct(List.of(_rules.getAge65PlusRule())));
		products.add(new DebitCardProduct(List.of(_rules.getIncomeLessThan12KRule(), _rules.getAgeOver17Rule())));
		products.add(new CreditCardProduct(List.of(_rules.getIncomeMoreThan12KRule(), _rules.getAgeOver17Rule())));
		products.add(new GoldCreditCardProduct(List.of(_rules.getIncomeMoreThan40K(), _rules.getAgeOver17Rule())));
		return products;
	}
}
