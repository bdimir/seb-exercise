package seb.domain.rules;

import seb.models.dto.PersonAnswers;

public class MustBeStudentRule implements IProductRule {
	public boolean IsApplicable(PersonAnswers personAnswers) {
		return personAnswers != null && personAnswers.getIsStudent();
	}
}