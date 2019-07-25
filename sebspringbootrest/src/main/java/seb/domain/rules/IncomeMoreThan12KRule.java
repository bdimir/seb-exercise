package seb.domain.rules;

import seb.models.dto.PersonAnswers;

public class IncomeMoreThan12KRule implements IProductRule {
	public boolean IsApplicable(PersonAnswers personAnswers) {
		return personAnswers != null && personAnswers.getIncome() > 12000;
	}
}