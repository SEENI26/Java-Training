package orgconditionalstatement;

public class IfElseConditionExample1 
{
	// all the numbers are having different values

	// a>b and a>c   -- a is largest
	// b>a  and b>c   --- b is largest
	// c>a and c>b   -- c largest

public static void main(String[] args) {
		
		int a=10, b=20,c=30;
		
		if(a>b && a>c) // --> the first condition is false,
			// This condition checks if a is greater than both b and c
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c) // --> the first condition is false,
			// this condition checks if b is greater than both a and c.
		{
			System.out.println("b is largest number");
		}
		// so check two condition then execute the else section
		else
		{
			System.out.println("c is largest number");
		}

	}


}
