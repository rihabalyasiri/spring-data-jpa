package com.example.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//Repository where CRUD happens

}
