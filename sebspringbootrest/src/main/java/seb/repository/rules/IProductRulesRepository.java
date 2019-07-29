package seb.repository.rules;

import seb.domain.rules.IProductRule;

public interface IProductRulesRepository {

	IProductRule getAgeLessThan18Rule();

	IProductRule getAgeOver17Rule();

	IProductRule getAge65PlusRule();

	IProductRule getIncomeMoreThanZeroRule();

	IProductRule getIncomeMoreThan12KRule();

	IProductRule getIncomeLessThan12KRule();

	IProductRule getIncomeMoreThan40KRule();

	IProductRule getMustBeStudentRule();

}