package com.ecommerce.catalog.service;
import java.util.List;

import com.ecommerce.catalog.model.Category;
import com.ecommerce.catalog.model.Product;

public interface ProductService {

	List<Category> saveProduct(Category category);

	List<Category> getAllProducts();

	Product getProductById(long id);

	void deleteProduct(long id);

	List<Category> findByCategory(String keyword);

	List<Product> findByProductName(String keyword);

	Category categoryid(long id);

	List<Category> incrsdata(String keyword);
	
}