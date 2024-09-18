package org.axis;

public class Bankinfo extends Axisbank
{
	public void deposit(float am) 
	{
		System.out.println("Enter the deposite Amount : " + am);
	
	}
	public static void main(String[] args) 
	{
		Bankinfo b= new Bankinfo();
		b.deposit(5000);
		b.deposit(15000f);
		b.fixed(258000f);
		b.depositweek(1250000l);
		
	}

}
