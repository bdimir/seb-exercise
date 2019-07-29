package seb.domain.products;

import seb.domain.rules.*;

public class StudentAccountProduct extends ProductBase {

	public StudentAccountProduct(MustBeStudentRule rule1, AgeOver17Rule rule2) {
		ProductRules.add(rule1);
		ProductRules.add(rule2);
	}

	@Override
	public String GetName() {
		return ProductNames.StudentAccount;
	}

}
