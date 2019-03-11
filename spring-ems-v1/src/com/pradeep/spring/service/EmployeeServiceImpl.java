package com.pradeep.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import com.pradeep.spring.dao.EmployeeDao;
import com.pradeep.spring.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
     
	
	
	public EmployeeServiceImpl() {
	System.out.println("Employee ServiceImpl created...");
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("Employee ServiceImpl setDao..");
		
	}

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("Employee ServiceImpl param constructor..");
		
	}

	
	
	@Override
	public boolean addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	
		
	
	}

	@Override
	public boolean removeEmployee(int employeeId) {
				return employeeDao.removeEmployee(employeeId);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getEmployee(employeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
			return employeeDao.getAllEmployees();
				
	}
	
	
	
	
}
