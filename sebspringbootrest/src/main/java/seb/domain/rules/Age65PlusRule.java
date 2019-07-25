package seb.domain.rules;

import seb.models.dto.PersonAnswers;

public class Age65PlusRule implements IProductRule {
	public boolean IsApplicable(PersonAnswers personAnswers) {
		return personAnswers != null && personAnswers.getAge() > 65;
	}
}