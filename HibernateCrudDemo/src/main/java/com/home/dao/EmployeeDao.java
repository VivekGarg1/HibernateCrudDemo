package com.home.dao;

import com.home.entities.Employee;

public interface EmployeeDao {
	
	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmployeeById(int employeeId);
	public abstract void updateEmployeeById(int  employeeId,double newsalary);
	public abstract void deleteEmployeeById(int  employeeId);

}
