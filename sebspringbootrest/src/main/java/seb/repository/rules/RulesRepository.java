package seb.repository.rules;

import seb.domain.rules.*;

public class RulesRepository implements IProductRulesRepository {
	private IProductRule _ageLessThan18Rule;
	private IProductRule _ageOver17Rule;
	private IProductRule _age65PlusRule;
	private IProductRule _incomeMoreThanZeroRule;
	private IProductRule _incomeMoreThan12KRule;
	private IProductRule _incomeLessThan12KRule;
	private IProductRule _incomeMoreThan40KRule;
	private IProductRule _mustBeStudentRule;

	@Override
	public IProductRule getAgeLessThan18Rule() {
		return this._ageLessThan18Rule;
	}

	@Override
	public IProductRule getAgeOver17Rule() {
		return this._ageOver17Rule;
	}

	@Override
	public IProductRule getAge65PlusRule() {
		return this._age65PlusRule;
	}

	@Override
	public IProductRule getIncomeMoreThanZeroRule() {
		return this._incomeMoreThanZeroRule;
	}

	@Override
	public IProductRule getIncomeMoreThan12KRule() {
		return this._incomeMoreThan12KRule;
	}

	@Override
	public IProductRule getIncomeLessThan12KRule() {
		return this._incomeLessThan12KRule;
	}

	@Override
	public IProductRule getIncomeMoreThan40KRule() {
		return this._incomeMoreThan40KRule;
	}

	@Override
	public IProductRule getMustBeStudentRule() {
		return this._mustBeStudentRule;
	}

	public RulesRepository() {
		this._ageLessThan18Rule = new AgeLessThan18Rule();
		this._ageOver17Rule = new AgeOver17Rule();
		this._age65PlusRule = new Age65PlusRule();
		this._incomeMoreThanZeroRule = new IncomeMoreThanZeroRule();
		this._incomeMoreThan12KRule = new IncomeMoreThan12KRule();
		this._incomeLessThan12KRule = new IncomeLessThan12KRule();
		this._incomeMoreThan40KRule = new IncomeMoreThan40KRule();
		this._mustBeStudentRule = new MustBeStudentRule();
	}
}
