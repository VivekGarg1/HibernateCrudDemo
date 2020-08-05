package com.home.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.home.dao.EmployeeDao;
import com.home.entities.Employee;
import com.home.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
			Integer id=(Integer) session.save(employee);
			System.out.println("Employee created with Id:: "+id);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public Employee fetchEmployeeById(int employeeId) {
		Employee employee=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			 employee=session.get(Employee.class, employeeId);
			if(employee != null)
				System.out.println(employee);
			else
				System.out.println("Employee does not exist!!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void updateEmployeeById(int employeeId, double newsalary) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		session.beginTransaction();
		Employee employee=session.get(Employee.class, employeeId);
		if(employee != null) {
		    employee.setSalary(newsalary);
		    session.update(employee);
		    session.getTransaction().commit();
		}
		else
			System.out.println("Employee does not exist!!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}

	@Override
	public void deleteEmployeeById(int employeeId) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Employee employee=session.get(Employee.class, employeeId);
			if(employee != null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
		}
        catch(HibernateException e){
			e.printStackTrace();
		}
	}

}
