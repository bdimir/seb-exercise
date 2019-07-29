package seb.repository.rules;

import seb.domain.rules.*;

public interface IProductRulesRepository {

	AgeLessThan18Rule getAgeLessThan18Rule();

	AgeOver17Rule getAgeOver17Rule();

	Age65PlusRule getAge65PlusRule();

	IncomeMoreThanZeroRule getIncomeMoreThanZeroRule();

	IncomeMoreThan12KRule getIncomeMoreThan12KRule();

	IncomeLessThan12KRule getIncomeLessThan12KRule();

	IncomeMoreThan40KRule getIncomeMoreThan40KRule();

	MustBeStudentRule getMustBeStudentRule();

}