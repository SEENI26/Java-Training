package orgstring;

public class Stringchartat

//Java String class charAt() method returns a char value at the given index numb
// string value start 0 to n
{
	public static void main(String args[]){  
		String name="javatpoint";  
		
		//returns the char value at the 4th index
		char ch=name.charAt(4);  
// suppose you give charAt Value is 10 is String Index Out of Bound Exception
		System.out.println("String character value is :" + ch);  
		}
}
