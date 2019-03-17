package com.pradeep.spring.dao;

import java.util.List;

import com.pradeep.spring.model.Employee;

public interface EmployeeDao {

	boolean addEmployee(Employee employee);
	boolean removeEmployee(int employeeId);
	Employee getEmployee(int employeeId);
	boolean updateEmployee(Employee employee);
	List<Employee> getAllEmployees();

}
