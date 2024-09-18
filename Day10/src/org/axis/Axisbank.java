package org.axis;

public class Axisbank 
{
	// Method to show saving account details
    public void deposit(int savamount) {
        System.out.println("BankInfo: Saving account details." + savamount);
    }

    // Method to show fixed deposit details
    public void fixed(Float monthly) {
        System.out.println("BankInfo: Fixed deposit details" + monthly);
    }

    // Method to show deposit details
    public void depositweek(Long week) {
        System.out.println("Generic deposit account : " + week);
    }

}
