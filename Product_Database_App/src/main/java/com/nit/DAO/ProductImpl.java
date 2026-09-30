package com.nit.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.model.Product;

@Repository
public class ProductImpl implements ProductDAO {
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public int insertProduct(Product product) {
		
		String sql = "insert into product(id,name,category,price) Values(?,?,?,?)";
		return template.update(sql, product.getId(),product.getName(),product.getCategory(),product.getPrice());
	}
	
	@Override
	public Product getProductById(int id) {
		String sql= "select * from product where id=?";
		return template.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),id);
	}
	
	@Override
	public List<Product> getAllProducts(){
		String sql = "select * from product";
		return template.query(sql, new BeanPropertyRowMapper<>(Product.class));
	}

}
