package com.simplilearn.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Purchase;

@Service
public interface PurchaseService {
	Purchase createPurchase(Purchase purchase);
	
	List<Purchase> findAll();
	Purchase findById(Long id);
	List<Purchase> findByDate(Date date);
	List<Purchase> findByType(String type);
	
	Purchase update(Long id, Purchase purchase);
	
	Purchase delete(Long id);

}
