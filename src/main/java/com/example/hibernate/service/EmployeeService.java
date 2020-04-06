package com.example.hibernate.service;

import java.util.ArrayList;

import com.example.hibernate.entity.Employee;

public interface EmployeeService {
	
	ArrayList<Employee> findAll();
	
	Employee getById(int id);
	
	void save(Employee employee);
	
	void deleteById(int id);
	

}
