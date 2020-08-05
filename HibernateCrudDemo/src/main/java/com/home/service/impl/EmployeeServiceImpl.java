package com.home.service.impl;

import com.home.dao.impl.EmployeeDaoImpl;
import com.home.entities.Employee;
import com.home.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void createEmployee(Employee employee) {
         new EmployeeDaoImpl().addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return new EmployeeDaoImpl().fetchEmployeeById(employeeId);
	}

	@Override
	public void updateEmployeeById(int employeeId, double newsalary) {
		new EmployeeDaoImpl().updateEmployeeById(employeeId, newsalary);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		new EmployeeDaoImpl().deleteEmployeeById(employeeId);
	}

}
