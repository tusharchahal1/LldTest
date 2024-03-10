package com.spring.ProxyDesignPattern;

public class ProxyDesignPattertTest {

	public static void main(String[] args) {

		try {
			EmployeeDo employeeDo = new EmployeeDo();
			employeeDo.setClient("ADMIN");
			employeeDo.setEmployeeId(1);
			
			
			EmployeeDao empTable = new EmployeeDaoProxy();
			empTable.create("ADMIN", employeeDo);
			System.out.println("Successfully created");
			
			empTable.get("ADMIN", 2);
			System.out.println("Successfull");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
