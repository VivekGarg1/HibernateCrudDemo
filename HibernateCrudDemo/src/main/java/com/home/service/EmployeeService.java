package com.home.service;

import com.home.entities.Employee;

public interface EmployeeService {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int employeeId);
	public abstract void updateEmployeeById(int  employeeId,double newsalary);
	public abstract void deleteEmployeeById(int  employeeId);

}
