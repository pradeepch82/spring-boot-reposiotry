package com;

import com.pradeep.spring.dao.MapEmployeeDaoImpl;
import com.pradeep.spring.model.Employee;
import com.pradeep.spring.service.EmployeeService;
import com.pradeep.spring.service.EmployeeServiceImpl;

public class EmsMainApp {

	private EmployeeService es;

	public EmsMainApp() {
		System.out.println("EmsMain App created....");
	}

	public void setEs(EmployeeService es) {
		this.es = es;
		System.out.println("EmsMain App setEs method....");
	}

	public EmsMainApp(EmployeeService es) {
		this.es = es;
		System.out.println("EmsMain App param constructor create.......");
	}

	public void addEmployee(Employee employee) {

		if (es.addEmployee(employee))
			System.out.println("Employee added successfully.......");
		else
			System.out.println("Problem in  adding employe.......");

	}

	public void updateEmployee(Employee employee) {

		if (es.updateEmployee(employee))
			System.out.println("Employee updated successfully.......");
		else
			System.out.println("employee doesn't exist......");
	}

	
	public void removeEmployee(int employeeId) {

		if (es.removeEmployee(employeeId))
			System.out.println("Employee deleted successfully.......");
		else
			System.out.println("employee doesn't exist......");
	}
	
	
	public void showEmployee(int employeeId) {

		Employee employee=es.getEmployee(employeeId);
		
		if (employee!=null) {
			System.out.println("Employee Details\n=====================");
		    System.out.println(es.getEmployee(employeeId));
		}
		else
			System.out.println("employee doesn't exist......");
	}

	public void showAllEmployees() {

	System.out.println("All Employees");
	System.out.println("================================================");
	
	for(Employee e:es.getAllEmployees())
		System.out.println(e);

	}
	
	
	public static void main(String[] args) {

	
		MapEmployeeDaoImpl medi=new MapEmployeeDaoImpl();
		
		EmployeeServiceImpl esi=new EmployeeServiceImpl(medi);
				
		EmsMainApp ema=new EmsMainApp();
	
	    ema.setEs(esi);
	
	    ema.showAllEmployees();
	
	
	
	
	
	}

}
