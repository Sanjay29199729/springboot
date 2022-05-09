package com.simplilearn.service;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;

@Service
public interface AdminService {
	
Admin findByName(String name);
Admin findByPassword(String password);

Admin update(String name, Admin admin);
}
