package org.edu;
//
public class ArtsCollege extends Education
{
	public void depart(String dept) 
	{
		System.out.println("Department is :" + dept);
	}
public static void main(String[] args) 
{
	ArtsCollege a= new ArtsCollege();
	a.ug("B.Sc Computer Science");
	a.pg(25);
	a.depart("BA English");
	
}
}
