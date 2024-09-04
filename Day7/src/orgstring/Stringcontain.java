package orgstring;

public class Stringcontain 

// Java String class contains() method searches the sequence of characters in this string. 
// It returns true if the sequence of char values is found in this string otherwise returns false.
{
	public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Check if the string contains "World"
        boolean containsWorld = str.contains("World");
        
        // Check if the string contains "Java"
        boolean containsJava = str.contains("Java");
        
        System.out.println("Contains 'World': " + containsWorld);
        System.out.println("Contains 'Java': " + containsJava);
    }
}


