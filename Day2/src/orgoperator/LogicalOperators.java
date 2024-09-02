package orgoperator;

public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		boolean a = true, b = false;

        // Logical AND
        System.out.println("a AND b: " + (a && b));  // true if both a and b are true

        // Logical OR
        System.out.println("a OR b: " + (a || b));   // true if either a or b is true

        // Logical NOT
        System.out.println("NOT a: " + (!a));        // true if a is false

        // Combining logical operators
        boolean c = a && (b || a);  // true if a is true and either b or a is true
        System.out.println("a AND (b OR a): " + c);

        boolean d = (a || b) && !b;  // true if either a or b is true and b is false
        System.out.println("(a OR b) AND NOT b: " + d);
	}

}
