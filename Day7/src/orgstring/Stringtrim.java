package orgstring;

public class Stringtrim 
//trim() removes all the leading and trailing spaces in the string
{
	public static void main(String[] args) {
        String originalString = "     Hello, World! ";
        
        // Print the original string and its length
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("Length of Original String: " + originalString.length());
        
        // Trim the string
        String trimmedString = originalString.trim();
        
        // Print the trimmed string and its length
        System.out.println("Trimmed String: \"" + trimmedString + "\"");
        System.out.println("Length of Trimmed String: " + trimmedString.length());
    }
}

