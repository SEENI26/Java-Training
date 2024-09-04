package orgstring;

// the equals() method is used to compare two strings to determine if they are exactly the same in terms of content.
//The comparison is case-sensitive, meaning that the strings must match exactly,
public class Stringequal 
{
	public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = "hello, world!"; // Different case
        
        // Comparing str1 and str2
        boolean isEqual1 = str1.equals(str2);
        
        // Comparing str1 and str3 (case-sensitive comparison)
        boolean isEqual2 = str1.equals(str3);
        
        System.out.println("str1 equals str2: " + isEqual1); // true
        System.out.println("str1 equals str3: " + isEqual2); // false
    }

}
