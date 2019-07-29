package seb.service;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import seb.models.dto.*;
import seb.product.ProductNames;
import seb.products.service.ProductsOfferService;
import seb.repository.products.ProductsRepository;
import seb.repository.rules.RulesRepository;

@RunWith(JUnit4.class)
public class SebProductsOfferTests {

	ProductsRepository _productsRepository;
	ProductsOfferService _productsOfferService;

	@Before
	public void setup() {
		_productsRepository = new ProductsRepository(new RulesRepository());
		_productsOfferService = new ProductsOfferService(_productsRepository);
	}

	@Test
	public void shouldOfferCurrentAccountAndDebitCardProduct() {

		// Arrange
		int age = 19;
		boolean isStudent = false;
		int incomeOptions = 2000;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 2);
		assertTrue(products.get(0) == ProductNames.CurrentAccount);
		assertTrue(products.get(1) == ProductNames.DebitCard);
	}
	
	@Test
	public void shouldOfferCurrentAccountPlusAnd3More() {

		// Arrange
		int age = 25;
		boolean isStudent = false;
		int incomeOptions = 45000;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 4);
		assertTrue(products.get(0) == ProductNames.CurrentAccount);
		assertTrue(products.get(1) == ProductNames.CurrentAccountPlus);
		assertTrue(products.get(2) == ProductNames.CreditCard);
		assertTrue(products.get(3) == ProductNames.GoldCreditCard);
	}

	@Test
	public void shouldOfferJuniorSaverAccount() {

		// Arrange
		int age = 14;
		boolean isStudent = false;
		int incomeOptions = 0;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 1);
		assertTrue(products.get(0) == ProductNames.JuniorSaverAccount);
	}
		
	@Test
	public void shouldOfferStudentAccountAndDebitCard() {

		// Arrange
		int age = 20;
		boolean isStudent = true;
		int incomeOptions = 0;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 2);
		assertTrue(products.get(0) == ProductNames.StudentAccount);
		assertTrue(products.get(1) == ProductNames.DebitCard);
	}

	@Test
	public void shouldOfferSeniorAccountAndDebitCard() {

		// Arrange
		int age = 66;
		boolean isStudent = false;
		int incomeOptions = 0;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 2);
		assertTrue(products.get(0) == ProductNames.SeniorAccount);
		assertTrue(products.get(1) == ProductNames.DebitCard);
	}

	@Test
	public void shouldOfferCreditCardAndCurrentAccount() {

		// Arrange
		int age = 30;
		boolean isStudent = false;
		int incomeOptions = 15000;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 2);
		assertTrue(products.get(0) == ProductNames.CurrentAccount);
		assertTrue(products.get(1) == ProductNames.CreditCard);
	}

	@Test
	public void shouldOfferGoldCreditCardAnd3More() {

		// Arrange
		int age = 30;
		boolean isStudent = false;
		int incomeOptions = 45000;
		PersonAnswers personAnswers = new PersonAnswers(age, isStudent, incomeOptions);

		// Act
		List<String> products = _productsOfferService.GetOffers(personAnswers);

		// Assert
		assertNotNull(products);
		assertTrue(products.size() == 4);		
		assertTrue(products.get(0) == ProductNames.CurrentAccount);
		assertTrue(products.get(1) == ProductNames.CurrentAccountPlus);
		assertTrue(products.get(2) == ProductNames.CreditCard);
		assertTrue(products.get(3) == ProductNames.GoldCreditCard);
	}

}
