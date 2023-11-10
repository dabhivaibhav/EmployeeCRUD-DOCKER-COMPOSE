package com.example.usercrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usercrud.Repository.EmployeeRepository;
import com.example.usercrud.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEMployee() {
		return repository.findAll();
	}

	public String addEmployee(Employee employee) {
		repository.save(employee);
		return "Employeee add successfully";
	}
}
