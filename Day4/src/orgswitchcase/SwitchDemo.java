package orgswitchcase;

// Java switch statement executes one statement from multiple conditions / like if-else-if ladder statement
// switch statement tests the equality of a variable against multiple values
// points:
// There can be one or N number of case values for a switch expression.
// The case value must be of switch expression type only.
public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int Weekno =1; 
		
		// Purpose of Switch Statement
		// *Reduce the Number of lines*

		switch (Weekno) // Weekno is a variable
		{
		case 1: System.out.println("Sunday"); break; // break is Jumping Command
		// Each case statement can have a break statement 
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default : System.out.println("invaild Week Number");
		// default have no  break statement because is last statement so no need !
		}
	}

}
