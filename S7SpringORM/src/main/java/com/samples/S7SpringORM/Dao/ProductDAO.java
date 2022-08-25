package com.samples.S7SpringORM.Dao;

import java.util.List;

import com.samples.S7SpringORM.entity.Product;

public interface ProductDAO {
	
	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product find(int id);
	
	List<Product> findAll();
}
