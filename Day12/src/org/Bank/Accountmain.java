package org.Bank;

public class Accountmain 
{
	public static void main(String[] args) 
	{
		Acdetails a = new Acdetails();
		
		// setter method
		a.setAcnumber(10114);
		a.setName("Srini");
		a.setAmount(15000);
		
		// Getter method
		System.out.println("Account Number : " + a.getAcnumber());
		System.out.println("Account Name : " + a.getName());
		System.out.println("Account deposite Amount : " + a.getAmount());
	}
 

}
