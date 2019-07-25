package seb.repository.products;

import java.util.List;
import seb.domain.products.IProduct;

public interface IProductsRepository {
	List<IProduct> GetProducts();
}
