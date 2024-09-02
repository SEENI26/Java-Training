package orgoperator;

public class BitwiseOperators {
	public static void main(String[] args) {
		 int a = 5;  // 0101 in binary
	        int b = 3;  // 0011 in binary

	        int andResult = a & b;  // AND operation
	        int orResult = a | b;   // OR operation
	        int xorResult = a ^ b;  // XOR operation
	        int notResult = ~a;     // NOT operation
	        int leftShift = a << 1; // Left Shift
	        int rightShift = a >> 1;// Right Shift

	        System.out.println("a & b = " + andResult);
	        System.out.println("a | b = " + orResult);
	        System.out.println("a ^ b = " + xorResult);
	        System.out.println("~a = " + notResult);
	        System.out.println("a << 1 = " + leftShift);
	        System.out.println("a >> 1 = " + rightShift);
	}
}
