package seb.product;

import seb.models.dto.PersonAnswers;

public interface IProduct {
	  String GetName();
      boolean IsValid(PersonAnswers personAnswers);
}
