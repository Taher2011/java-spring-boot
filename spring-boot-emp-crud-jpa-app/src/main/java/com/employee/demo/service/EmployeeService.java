package com.employee.demo.service;

import java.util.List;

import com.employee.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);

	public void deleteById(int id);

}
