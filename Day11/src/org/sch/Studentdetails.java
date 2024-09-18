package org.sch;

public class Studentdetails implements Student
{

	@Override
	public void studentname() 
	{
		System.out.println("Student Name: seenivasan");	
	}

	@Override
	public void studentfathername() 
	{
	System.out.println("Student Father Name is : Iyappan");	
	}

	@Override
	public void studentdob() 
	{
		System.out.println("Student Date of Birth is : 18/04/2002");
	}

	@Override
	public void Studentbloodgroup() 
	{
		System.out.println("Blood Group is : B+");
	}
	
	public static void main(String[] args) 
	{
		Studentdetails s= new Studentdetails();
		s.studentname();
		s.studentfathername();
		s.studentdob();
		s.Studentbloodgroup();
	}

}
