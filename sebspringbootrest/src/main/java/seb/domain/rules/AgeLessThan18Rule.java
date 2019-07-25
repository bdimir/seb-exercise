package seb.domain.rules;


import seb.models.dto.PersonAnswers;

public class AgeLessThan18Rule implements IProductRule {
	public boolean IsApplicable(PersonAnswers personAnswers) {
		return personAnswers != null && personAnswers.getAge() < 18;
	}
}
