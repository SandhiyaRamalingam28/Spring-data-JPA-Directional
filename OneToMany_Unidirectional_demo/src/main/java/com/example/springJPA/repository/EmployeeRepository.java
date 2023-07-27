package com.example.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springJPA.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
