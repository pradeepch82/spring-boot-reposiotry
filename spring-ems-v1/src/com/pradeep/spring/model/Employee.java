package com.pradeep.spring.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Employee implements Serializable {
	private int id;
	private String name;
	private double salary;
	private String email;
	private Date doj;
	private String mobile;

	public Employee() {
		this.id = new Random().nextInt(100000);
		this.doj = new Date();

	}

	public Employee(String name, double salary, String email, String mobile) {
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.doj = new Date();

		this.mobile = mobile;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", doj=" + doj
				+ ", mobile=" + mobile + "]";
	}

	
	
}
