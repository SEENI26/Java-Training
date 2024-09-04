package orgstring;

public class Stringequal1 
{
	 public static void main(String[] args) {
	        String str1 = "Hello, World!";
	        String str2 = "hello, world!";
	        
	        // Case-insensitive comparison
	        boolean isEqual = str1.equalsIgnoreCase(str2);
	        
	        System.out.println("str1 equals str2 (case-insensitive): " + isEqual); // true
	        // another method
	        System.out.println(str1.equalsIgnoreCase(str2));
	    }

}
