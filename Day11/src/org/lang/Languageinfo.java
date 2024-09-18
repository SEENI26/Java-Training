package org.lang;

//  language info is child class
// object create in child class 
public class Languageinfo extends Statedetails
{
	private void tamillanguage() 
	{
		System.out.println("Dravidian Language");
	}
	private void englishlanguage() 
	{
		System.out.println("English Language");
	}
	private void hindilanguage() 
	{
		System.out.println("Ariyan Language");

	}
	public static void main(String[] args) 
	{
		Languageinfo l =new Languageinfo();
		l.SouthIndia();
		l.Northindia();
		l.Westindia();
		l.Eastindia();
		l.tamillanguage();
		l.englishlanguage();
		l.hindilanguage();
		
	}

}
