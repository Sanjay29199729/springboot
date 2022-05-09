package com.simplilearn.service;

import java.util.List; 

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Register;

@Service
public interface RegisterService {

	Register createRegister(Register register);
	List<Register> findAll();
	Register findById(Long id);
	Register findByEmail(String email);
	Register findByPassword(String password);
	List<Register> findByName(String name);

}
