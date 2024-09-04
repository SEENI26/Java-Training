package orgstring;

// String concatenation in Java refers to the operation of joining 
// two or more strings together to form a single, longer string.
public class Stringjoin 
{
	public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String qualification = "BA";
        
        //join String
        System.out.println(firstName+lastName);

        
        // Concatenate strings 
        System.out.println(firstName.concat(lastName).concat(qualification));
       
        // another method for join string
        String fullName = firstName + " " + lastName + " " + qualification;

        System.out.println("Full Name: " + fullName);
    }

}
