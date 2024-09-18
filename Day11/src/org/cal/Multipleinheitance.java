package org.cal;

public class Multipleinheitance implements AdditionI1,AdditionI2 
{

	@Override
	public void m2() 
	{		
		System.out.println("This is M1");
	}

	@Override
	public void m1() 
	{
		System.out.println("This is M2");
	}
public static void main(String[] args) {
		
	Multipleinheitance mi= new Multipleinheitance();
		mi.m1();
		mi.m2();
		
		System.out.println(mi.x);
		System.out.println(mi.y);
		
		

	}


}
