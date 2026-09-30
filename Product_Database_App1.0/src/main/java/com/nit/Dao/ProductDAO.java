package com.nit.Dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.enitity.Product;

@Repository
public interface ProductDAO {
	
	public int insertProduct(Product product);
	
	public Product getProductByid(int id);
	
	List<Product> getAllProducts();
	
	public int updateProduct(Product product);
	
	public int deletProductById(int id);
	
	public List<Product> getProductsByCategory(String category);
	
	public List<Product> getProductsInPriceRange(double min,double max);
	
	public int countTotalProducts();
}
