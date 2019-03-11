package com.pradeep.spring.dao;

import java.util.ArrayList;
import java.util.List;

import com.pradeep.spring.data.EmployeeMap;
import com.pradeep.spring.model.Employee;


public class MapEmployeeDaoImpl implements EmployeeDao {

	public MapEmployeeDaoImpl() {
		System.out.println("MapEmployeeDaoImpl created....");
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return EmployeeMap.INSTANCE.getMap().put(employee.getId(), employee)==employee;
		
	}

	@Override
	public boolean removeEmployee(int employeeId) {
		if (EmployeeMap.INSTANCE.getMap().containsKey(employeeId)) {
			EmployeeMap.INSTANCE.getMap().remove(employeeId);
			return true;
		}
		return false;

	}

	@Override
	public Employee getEmployee(int employeeId) {
		
			return EmployeeMap.INSTANCE.getMap().get(employeeId);
	
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if(EmployeeMap.INSTANCE.getMap().containsKey(employee.getId()))
		{
			EmployeeMap.INSTANCE.getMap().put(employee.getId(), employee);	
		return true;
		}
		
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(EmployeeMap.INSTANCE.getMap().values());
	}
}
