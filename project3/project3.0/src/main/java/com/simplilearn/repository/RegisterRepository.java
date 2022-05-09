package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Register;


@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

	Register findByEmail(String email);
	Register findByPassword(String password);
	List<Register> findByName(String name);
	
}
