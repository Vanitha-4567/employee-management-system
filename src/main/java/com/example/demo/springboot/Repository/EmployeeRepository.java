package com.example.demo.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.springboot.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}

	
