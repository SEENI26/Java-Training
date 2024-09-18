package org.cus;

// Polymorphism 
// Polymorphism means "many forms"

// In This Program Using method Overloading
// Method Over loading mean (Run time Polymorphism)
public class Customer 
{
	// 1. Duplicate method not allowing in java like ex cusdetail
	// 2. method overloading allow duplicate values
	// like cusdetil(string()) --> string is data type 
	// so same method  and different Data type
	
	private void cusdetail(String name)
	{
	System.out.println("Customer Name : " + name);
 
	}
	private void cusdetails(int age) 
	{
		System.out.println("Customer age :" + age);
	}
	private void cusdetils(float salary)
	{
		System.out.println("Customer Salary: " + salary);
	}
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.cusdetail("seenivasan");
		c.cusdetails(23);
		c.cusdetils(15000f);
		 
	}

}
