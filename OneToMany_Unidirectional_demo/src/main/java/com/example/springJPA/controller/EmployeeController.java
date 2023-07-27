package com.example.springJPA.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJPA.model.Employee;
import com.example.springJPA.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping("/uni/Employee")
	public ResponseEntity<List<Employee>> createEmployee(@RequestBody List<Employee> user) {
		List<Employee> actualUser = employeeRepository.saveAll(user);
		return ResponseEntity.ok(actualUser);
	}

}
