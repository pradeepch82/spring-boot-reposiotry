package com.pradeep.spring.service;

import java.util.List;

import com.pradeep.spring.model.Employee;

public interface EmployeeService {

	boolean addEmployee(Employee employee);

	boolean removeEmployee(int employeeId);

	Employee getEmployee(int employeeId);

	boolean updateEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
