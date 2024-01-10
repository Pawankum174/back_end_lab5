package com.greatlearning.springboot.service;

import java.util.List;

import com.greatlearnig.springboot.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

	void save(Employee employee);

	Employee findAll();

	Employee findById(int id);

	void deleteById(int id);

	Employee employeeById(Long id);
   	

}