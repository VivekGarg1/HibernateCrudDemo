package com.home.client;

import java.util.Date;

import com.home.entities.Employee;
import com.home.service.EmployeeService;
import com.home.service.impl.EmployeeServiceImpl;

public class ClientTestWithServiceDao {

	
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		//createEmployee(employeeService);
		//getEmployeeById(employeeService);
		//updateEmployeeById(employeeService);
		deleteEmployeById(employeeService);
}

	private static void deleteEmployeById(EmployeeService employeeService) {
		employeeService.deleteEmployeeById(1);
		}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee=employeeService.getEmployeeById(1);
		}

	private static void updateEmployeeById(EmployeeService employeeService) {
		Employee employee=employeeService.getEmployeeById(1);
		if(employee != null) {
		    employeeService.updateEmployeeById(1, 10000.00);
		}
		else
			System.out.println("Employee does not exist!!!");
		}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee=new Employee();
		employee.setEmployeeName("Paras");
		employee.setEmail("paras@gmail.com");
		employee.setDoj(new Date());
		employee.setSalary(16000.00);
		employeeService.createEmployee(employee);
		}

}
