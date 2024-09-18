package org.edu;
// child extends Parent
public class Education extends Medical
{
	private void ug() 
	{
		System.out.println("Under Graduate");
	}
	private void pg() 
	{
		System.out.println("post Graduate");
	}
	public static void main(String[] args) 
	{
		Education e = new Education();
		e.bsc();
		e.bEd();
		e.bA();
		e.BBA();
		e.bE();
		e.bTech();
		e.Mbbs();
		e.dental();
		e.ug();
		e.pg();
		
	}

}
