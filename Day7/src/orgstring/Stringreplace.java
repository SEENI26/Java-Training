package orgstring;

public class Stringreplace 

//  string replacing all the old char or CharSequence to new char or CharSequence.
{
	public static void main(String args[])
	{  
		String s1="my name is Seenivasan and my course is java";  
		
		String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
		
		System.out.println(replaceString);  
	}	
}
