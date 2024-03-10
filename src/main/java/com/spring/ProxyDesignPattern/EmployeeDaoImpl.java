package com.spring.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void delete(String client, int employeeId) {
		System.out.println("Deleting employee - " + employeeId);

	}

	@Override
	public void create(String client, EmployeeDo obj) {
		System.out.println("Creating employee for - " + client);
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) {
		System.out.println("Searching employee by id - " + employeeId);
		return new EmployeeDo();
	}



}
