package seb.products.service;

import java.util.List;

import seb.models.dto.PersonAnswers;

public interface IProductsOfferService {

	List<String> GetOffers(PersonAnswers personAnswers);

}