package com.newhut.springsecuritydemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newhut.springsecuritydemo.entity.Employee;
import com.newhut.springsecuritydemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
