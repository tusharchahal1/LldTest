package com.spring.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {

	EmployeeDao employeeDao;
	
	EmployeeDaoProxy() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String client, EmployeeDo obj) throws Exception {

		if(client.equals("ADMIN")) {
			employeeDao.create(client, obj);
			return;
		}
		throw new Exception("Access Denied in creation");

	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		
		if(client.equals("ADMIN")) {
			employeeDao.delete(client, employeeId);
			return;
		}
		throw new Exception("Access Denied in deletion");

	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN") | client.equals("USER")) {
			return employeeDao.get(client, employeeId);
		}
		
		return null;
	}

}
