package org.cus;

public class Employee 
{
	// This program Based on Data type Count
	private void empdetail(String name)
	{
	System.out.println("Employee Name : " + name);
 
	}
	private void empdetails(int age, String address) 
	{
		System.out.println("Employee age :" + age);
		System.out.println("Employee Address :" + address);
	}
	private void empdetils(int ID, float salary)
	{
		System.out.println("Employee ID : " + ID);
		System.out.println("Employee Salary: " + salary);
	}
	public static void main(String[] args) 
	{
		Employee c = new Employee();
		c.empdetail("seenivasan");
		c.empdetails(23, "Trichy");
		c.empdetils(101, 15000f);
		 
	}

}
