package orgbasics;

public class Datatypes {
	public static void main(String[] args) 
	{
		byte byteVar = 127;         // 8-bit signed integer
        short shortVar = 32767;     // 16-bit signed integer
        int intVar = 2147483647;    // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer -->Number Without decimal and letter is need at the End of the Value

        float floatVar = 3.14F;     // 32-bit floating point --> decimal Number and letter is need at the End of the Value
        double doubleVar = 3.141592653589793; // 64-bit floating point --> decimal Number

        char charVar = 'A';         // 16-bit Unicode character --> Single Character
        boolean booleanVar = true;  // true or false
        
     // Non-primitive data type
        String stringVar = "Hello, World!";

        // Print values
        System.out.println("Primitive data types:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("Non-Primitive data types:");
        System.out.println("String Value: " + stringVar);
	}
}
 