package com.nit.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.enitity.Product;

@Repository
public class ProductDaoImpl implements ProductDAO {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public int insertProduct(Product product) {
		
		String sql = "INSERT INTO PRODUCT(id, name, Category, price) VALUES (?, ?, ?, ?)";
		return template.update(sql,product.getId(),product.getName(),product.getCategory(),product.getPrice());
	}

	@Override
	public Product getProductByid(int id) {
		String sql = "Select * from Product Where id=?";
		return template.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),id);
	}

	@Override
	public List<Product> getAllProducts() {
		String sql = "Select * from Product order by id";
		return template.query(sql, new BeanPropertyRowMapper<>(Product.class));
	}

	@Override
	public int updateProduct(Product product) {
		String sql = "Update Product Set name=?,Category=?,Price=? where id=? ";
		return template.update(sql, product.getName(),product.getCategory(),product.getPrice(),product.getId());
	}

	@Override
	public int deletProductById(int id) {
		String sql = "Delete from Product where id=?";
		return template.update(sql,id);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		String sql = "Select * from Product where category=?";
		return template.query(sql, new BeanPropertyRowMapper<>(Product.class),category.trim());
	}
	@Override
	public List<Product> getProductsInPriceRange(double min, double max) {
		String sql = "Select * from Product where Price  Between ? AND ?";
		return template.query(sql, new BeanPropertyRowMapper<>(Product.class),min,max);
	}

	@Override
	public int countTotalProducts() {
		String sql = "Select Count(*) from Product";
		return template.queryForObject(sql, Integer.class);
	}

}
