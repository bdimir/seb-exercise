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
		products.add(new CurrentAccountProduct(_rules.getIncomeMoreThanZeroRule(), _rules.getAgeOver17Rule()));
		products.add(new CurrentAccountPlusProduct(_rules.getIncomeMoreThan40KRule(), _rules.getAgeOver17Rule()));
		products.add(new JuniorSaverAccountProduct(_rules.getAgeLessThan18Rule()));
		products.add(new StudentAccountProduct(_rules.getMustBeStudentRule(), _rules.getAgeOver17Rule()));
		products.add(new SeniorAccountProduct(_rules.getAge65PlusRule()));
		products.add(new DebitCardProduct(_rules.getIncomeLessThan12KRule(), _rules.getAgeOver17Rule()));
		products.add(new CreditCardProduct(_rules.getIncomeMoreThan12KRule(), _rules.getAgeOver17Rule()));
		products.add(new GoldCreditCardProduct(_rules.getIncomeMoreThan40KRule(), _rules.getAgeOver17Rule()));
		return products;
	}
}
