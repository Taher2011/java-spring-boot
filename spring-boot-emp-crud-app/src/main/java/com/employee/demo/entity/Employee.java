package com.employee.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@SequenceGenerator(name="EMP_SEQ", sequenceName="EMPLOYEE_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EMP_SEQ")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CITY")
	private String city;

	@Column(name = "DEPARTMENT")
	private String department;

	public Employee() {
		super();
	}

	public Employee(String name, String city, String department) {
		super();
		this.name = name;
		this.city = city;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", department=" + department + "]";
	}

}
