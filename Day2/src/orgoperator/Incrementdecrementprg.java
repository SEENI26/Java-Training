package orgoperator;

public class Incrementdecrementprg {


	public static void main(String[] args) {
		
		int a = 10;
        System.out.println("Initial value of a: " + a);

        // Pre-increment -->(++a)
        System.out.println("Pre-increment: " + (++a)); 

        // Post-increment -->(a++)
        System.out.println("Post-increment: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        // Pre-decrement -->(--a)
        System.out.println("Pre-decrement: " + (--a));

        // Post-decrement --> (a--)
        System.out.println("Post-decrement: " + (a--));
        System.out.println("Value of a after post-decrement: " + a);

        // Floating-point example
        double b = 20.5;
        System.out.println("\nInitial value of b: " + b);

        // Pre-increment
        System.out.println("Pre-increment: " + (++b));

        // Post-increment
        System.out.println("Post-increment: " + (b++));
        System.out.println("Value of b after post-increment: " + b);

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--b));

        // Post-decrement
        System.out.println("Post-decrement: " + (b--));
        System.out.println("Value of b after post-decrement: " + b);
		
	}

}
