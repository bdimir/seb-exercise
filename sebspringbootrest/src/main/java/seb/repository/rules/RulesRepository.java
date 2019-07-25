package seb.repository.rules;

import seb.domain.rules.*;

public class RulesRepository implements IProductRulesRepository {
	private AgeLessThan18Rule _ageLessThan18Rule;
	private AgeOver17Rule _ageOver17Rule;
	private Age65PlusRule _age65PlusRule;
	private IncomeMoreThanZeroRule _incomeMoreThanZeroRule;
	private IncomeMoreThan12KRule _incomeMoreThan12KRule;
	private IncomeLessThan12KRule _incomeLessThan12KRule;
	private IncomeMoreThan40KRule _incomeMoreThan40K;
	private MustBeStudentRule _mustBeStudentRule;

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
	public IProductRule getIncomeMoreThan40K() {
		return this._incomeMoreThan40K;
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
		this._incomeMoreThan40K = new IncomeMoreThan40KRule();
		this._mustBeStudentRule = new MustBeStudentRule();
	}
}
