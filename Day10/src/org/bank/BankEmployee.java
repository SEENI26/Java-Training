package org.bank;
// Method overloading
public class BankEmployee 
{
	private void staffdet(int ID, String name) 
	{
		System.out.println("Bank Employee ID : " + ID);
		System.out.println("Bank Employee Name: " + name);
	}
	private void staffdet(String Designation, String dept) 
	{
		System.out.println("Designation is :" + Designation);
		System.out.println("Department is :" + dept);
	}
	private void staffdet(String phnum,Float salary) 
	{
		System.out.println("Employee Ph Number is :" + phnum );
		System.out.println("Employee salary is :" + salary);
	}
	
	public static void main(String[] args) 
	{
		BankEmployee b= new BankEmployee();
		
		b.staffdet(101, "Seenivasan");
		b.staffdet("Cashier", "Acccounts");
		b.staffdet("9784561230", 17500f);
	}
}
