package seb.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import seb.models.dto.PersonAnswers;
import seb.products.service.IProductsOfferService;
import seb.products.service.ProductsOfferService;
import seb.repository.products.IProductsRepository;
import seb.repository.products.ProductsRepository;
import seb.repository.rules.IProductRulesRepository;
import seb.repository.rules.RulesRepository;

@RestController
public class ProductsController {
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public ResponseEntity<List<String>> getProducts(@RequestBody PersonAnswers personAnswers) {
		IProductRulesRepository rules = new RulesRepository();
		IProductsRepository productsRepository = new ProductsRepository(rules);
		IProductsOfferService productsOfferService = new ProductsOfferService(productsRepository);
		List<String> products = productsOfferService.GetOffers(personAnswers);
		return new ResponseEntity<List<String>>(products, HttpStatus.OK);
	}
}
