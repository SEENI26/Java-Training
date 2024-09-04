package orgstring;

import java.util.Scanner;

public class MobileNumberValidation 
{
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a mobile number
        System.out.print("Enter the mobile number: ");
        String mobileNumber = scanner.nextLine();

        // Get the length of the mobile number
        int length = mobileNumber.length();

        // Check the length of the mobile number
        if (length == 10) 
        {
            System.out.println("The mobile number is valid and is an Indian number.");
        } 
        else if (length > 11) 
        {
            System.out.println("The mobile number is valid and is a Foreign number.");
        } 
        else 
        {
            System.out.println("The mobile number is invalid.");
        }

        // Close the scanner
        scanner.close();
    }

}
