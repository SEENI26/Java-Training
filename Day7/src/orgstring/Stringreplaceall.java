package orgstring;

public class Stringreplaceall 

// String class replaceAll() method returns a string replacing all the sequence of characters.
{
	public static void main(String args[]){  
		String s1="javatpoint is a very good website";
		
		// like example in character to change a letter like replace a to e 
		
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
		}

}
