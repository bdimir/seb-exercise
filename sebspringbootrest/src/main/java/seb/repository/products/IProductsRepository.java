package seb.repository.products;

import java.util.List;

import seb.product.IProduct;

public interface IProductsRepository {
	List<IProduct> GetProducts();
}
