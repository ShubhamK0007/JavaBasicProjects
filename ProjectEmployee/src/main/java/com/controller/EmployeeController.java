package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceInterface empservice;

	@PostMapping("/add")
	public Employee addNewEmployee(@RequestBody Employee e) {
		return empservice.addEmployee(e);
	}

	@GetMapping("find/{id}")
	public Employee getOneEmployee(@PathVariable int id) {
		return empservice.getOneEmployee(id);
	}



}
