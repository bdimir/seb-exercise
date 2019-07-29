package seb.repository.products;

import java.util.ArrayList;
import java.util.List;
import seb.product.IProduct;
import seb.product.Product;
import seb.product.ProductNames;
import seb.repository.rules.IProductRulesRepository;

public class ProductsRepository implements IProductsRepository {

	private IProductRulesRepository _rules;

	public ProductsRepository(IProductRulesRepository rules) {
		_rules = rules;
	}

	public List<IProduct> GetProducts() {

		List<IProduct> products = new ArrayList<IProduct>();
		products.add(new Product(ProductNames.CurrentAccount, List.of(_rules.getIncomeMoreThanZeroRule(), _rules.getAgeOver17Rule())));
		products.add(new Product(ProductNames.CurrentAccountPlus,List.of(_rules.getIncomeMoreThan40KRule(), _rules.getAgeOver17Rule())));
		products.add(new Product(ProductNames.JuniorSaverAccount,List.of(_rules.getAgeLessThan18Rule())));
		products.add(new Product(ProductNames.StudentAccount,List.of(_rules.getMustBeStudentRule(), _rules.getAgeOver17Rule())));
		products.add(new Product(ProductNames.SeniorAccount,List.of(_rules.getAge65PlusRule())));
		products.add(new Product(ProductNames.DebitCard,List.of(_rules.getIncomeLessThan12KRule(), _rules.getAgeOver17Rule())));
		products.add(new Product(ProductNames.CreditCard,List.of(_rules.getIncomeMoreThan12KRule(), _rules.getAgeOver17Rule())));
		products.add(new Product(ProductNames.GoldCreditCard,List.of(_rules.getIncomeMoreThan40KRule(), _rules.getAgeOver17Rule())));
		return products;
	}
}
