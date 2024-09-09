package Org.oops;

public class Employee 
{
	// Variable
	int Emid;
	String EmName;
	String Designation;
	int Salary;
	
	void display()
	// Method
	{
		System.out.println(Emid);
		System.out.println(EmName);
		System.out.println(Designation);
		System.out.println(Salary);
	}
	public static void main(String[] args)   
	{
		// object
		Employee Emp =new Employee();
		
		// variable Values
		Emp.Emid=101;
		Emp.EmName="Seenivasan";
		Emp.Designation="QC/QA";
		Emp.Salary=10000;
		
		Emp.display();
	}
}
