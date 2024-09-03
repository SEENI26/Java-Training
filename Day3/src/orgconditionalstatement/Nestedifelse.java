package orgconditionalstatement;

public class Nestedifelse 
{
public static void main(String[] args) {
	
		if(1==1) // --> 1 equal to 1 is true
		{
			if(1==2) // --> 1 not equal to 2 so false  
			{
				System.out.println("ABC");
			}
			// --> so execute the else condition
			else 
			{
				System.out.println("123");
			}
		}
		else //--> this else condition not in if Section so not executed
		{
	
			System.out.println("XYZ");
			}
		
	
	}

}
