package com.simplilearn.service;

import java.util.List;
 

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;

@Service
public interface ProductService {
//C R U D
	//Create
	Product createProduct(Product product);
	
	//Read
	List<Product> getProducts();
	Product getProductById(Long id);
	List<Product> getProductByName(String name);
	List<Product> getProductByprice(Long price);
	List<Product> getProductByColour(String colour);
	List<Product> getProductByCategory(String category);
	//Update
	Product updateProduct(Long id, Product product);
	
	//Delete
	Product deleteProduct(Long id);
	
}
