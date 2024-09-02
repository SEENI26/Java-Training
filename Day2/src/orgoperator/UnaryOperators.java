package orgoperator;

public class UnaryOperators {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int d = +a; // Unary plus
        int e = -b; // Unary minus
        int f = ++a; // Pre-increment
        int g = b--; // Post-decrement

        System.out.println("\nUnary Operators:");
        System.out.println("+a: " + d);
        System.out.println("-b: " + e);
        System.out.println("++a: " + f);
        System.out.println("b--: " + g);
	}

}
