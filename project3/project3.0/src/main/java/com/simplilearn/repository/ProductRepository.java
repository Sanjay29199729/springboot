package com.simplilearn.repository;

import java.util.List;  

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> getByName(String name);
	List<Product> getByColour(String colour);
	List<Product> getByprice(Long price);
	List<Product> getByCategory(String category);

}
