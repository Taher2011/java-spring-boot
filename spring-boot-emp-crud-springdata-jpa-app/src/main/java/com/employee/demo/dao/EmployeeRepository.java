package com.employee.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
