package com.nit.DAO;

import java.util.List;

import com.nit.model.Product;

public interface ProductDAO {
	
	public int insertProduct(Product product);
	public Product getProductById(int id);
	public List<Product> getAllProducts();
	

}
