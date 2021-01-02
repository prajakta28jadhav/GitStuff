package com.java.pojo;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setId(1);
		emp.setName("Reva");
		emp.setDesignation("developer");
		
		System.out.println("Employee info :"+emp);

	}

}
