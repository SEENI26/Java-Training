package Org.string;

import java.util.Arrays;

// Converting String To Char Array
public class Reversestring2
{
	public static void main(String[] args) 
	{
		String s ="Seenivasan";
		String rev="";
		
		// convert String to Character type Array
		char a[]=s.toCharArray();
		
		System.out.println("String converter to Array:" + Arrays.toString(a));
		//[s,e,e,n,i,v,a,s,a,n]
		
		for(int i=a.length-1;i>=0;i--) 
		{
			rev = rev+a[i];
			
		}
		
		System.out.println("Reverese String is : " + rev);
		
	}

}
