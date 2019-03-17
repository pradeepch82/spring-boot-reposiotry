package com.pradeep.spring.data;

import java.util.HashMap;
import java.util.Map;

import com.pradeep.spring.model.Employee;

public enum EmployeeMap {
	INSTANCE;

	private Map<Integer, Employee> map;

	private EmployeeMap() {

		this.map = new HashMap<>();
		Employee e1 = new Employee("Sachin", 345666, "Sachin@gmail.com", "7158762627");
		Employee e2 = new Employee("Pradeep", 445666, "Pradeep@gmail.com", "8158762628");
		Employee e3 = new Employee("Mohan", 545666, "Mohan@gmail.com", "9158762629");
		Employee e4 = new Employee("Sunil", 645666, "Sunil@gmail.com", "9158762629");

		this.map.put(e1.getId(), e1);
		this.map.put(e2.getId(), e2);
		this.map.put(e3.getId(), e3);
		this.map.put(e4.getId(), e4);
		
	}

	public Map<Integer, Employee> getMap() {
		return map;
	}

}
