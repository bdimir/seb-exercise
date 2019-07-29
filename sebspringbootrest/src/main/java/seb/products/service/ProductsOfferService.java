package seb.products.service;

import java.util.ArrayList;
import java.util.List;

import seb.models.dto.PersonAnswers;
import seb.product.IProduct;
import seb.repository.products.IProductsRepository;

public class ProductsOfferService implements IProductsOfferService {

	private IProductsRepository _productsRepository;

	public ProductsOfferService(IProductsRepository productsRepository) {
		_productsRepository = productsRepository;
	}

	@Override
	public List<String> GetOffers(PersonAnswers personAnswers) {
		List<IProduct> currentProducts = _productsRepository.GetProducts();
		List<String> suggestedProducts = new ArrayList<String>();
		for(IProduct product : currentProducts) {
			if(product.IsValid(personAnswers)) {
				suggestedProducts.add(product.GetName());
			}
		}
		return suggestedProducts;
	}
}
