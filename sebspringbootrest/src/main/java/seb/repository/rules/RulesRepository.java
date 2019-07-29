package seb.repository.rules;

import seb.domain.rules.*;

public class RulesRepository implements IProductRulesRepository {
	private AgeLessThan18Rule _ageLessThan18Rule;
	private AgeOver17Rule _ageOver17Rule;
	private Age65PlusRule _age65PlusRule;
	private IncomeMoreThanZeroRule _incomeMoreThanZeroRule;
	private IncomeMoreThan12KRule _incomeMoreThan12KRule;
	private IncomeLessThan12KRule _incomeLessThan12KRule;
	private IncomeMoreThan40KRule _incomeMoreThan40KRule;
	private MustBeStudentRule _mustBeStudentRule;

	@Override
	public AgeLessThan18Rule getAgeLessThan18Rule() {
		return this._ageLessThan18Rule;
	}
	
	@Override
	public AgeOver17Rule getAgeOver17Rule() {
		return this._ageOver17Rule;
	}
	
	@Override
	public Age65PlusRule getAge65PlusRule() {
		return this._age65PlusRule;
	}

	@Override
	public IncomeMoreThanZeroRule getIncomeMoreThanZeroRule() {
		return this._incomeMoreThanZeroRule;
	}

	@Override
	public IncomeMoreThan12KRule getIncomeMoreThan12KRule() {
		return this._incomeMoreThan12KRule;
	}

	@Override
	public IncomeLessThan12KRule getIncomeLessThan12KRule() {
		return this._incomeLessThan12KRule;
	}

	@Override
	public IncomeMoreThan40KRule getIncomeMoreThan40KRule() {
		return this._incomeMoreThan40KRule;
	}

	@Override
	public MustBeStudentRule getMustBeStudentRule() {
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
