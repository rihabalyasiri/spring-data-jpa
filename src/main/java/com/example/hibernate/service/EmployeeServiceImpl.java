package com.example.hibernate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hibernate.dao.EmployeeRepository;
import com.example.hibernate.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public ArrayList<Employee> findAll() {
		
		return (ArrayList<Employee>) employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		Optional<Employee> resultOptional = employeeRepository.findById(id);
		
		Employee employee = null;
		
		if(resultOptional.isPresent()) {
			employee = resultOptional.get();
		}else {
			throw new RuntimeException("did not found Employee with id: " + id);
		}
		
		return employee;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
		
	}
	
	
	
}
