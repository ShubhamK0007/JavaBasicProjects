package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{

	@Autowired
	EmployeeRepository emprepo;

	@Override
	public Employee addEmployee(Employee e) {
		return emprepo.save(e);
	}

	@Override
	public Employee getOneEmployee(int id) {
		return emprepo.findById(id).orElse(null);
	}

	
	
	
	
}
