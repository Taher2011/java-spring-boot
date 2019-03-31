package com.employee.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.update(employee);
	}

	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId", id);
		query.executeUpdate();
	}

}
