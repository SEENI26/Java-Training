package Org.string;

public class Reversestring 
{
public static void main(String[] args) 
{
	String s= "Seenivasan";
	System.out.println("Orginal String is :" + s);
	String rev ="";
	
	//for(int i=0; i<s.length();i++) -- 
	// in this for loop method same get string length but forwardly working
	for(int i=s.length()-1;i>=0;i--)
		// in this for loop get string length then reversely loop running
	{
		//rev= s.charAt(i) +rev; -- another method
		
		rev = rev+s.charAt(i);
}
	System.out.println("Reverse String is :" + rev);
}
}