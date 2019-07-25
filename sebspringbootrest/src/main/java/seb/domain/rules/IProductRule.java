package seb.domain.rules;

import seb.models.dto.PersonAnswers;

public interface IProductRule {
	boolean IsApplicable(PersonAnswers personAnswers);
}
