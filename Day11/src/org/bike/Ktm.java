package org.bike;

// the interface must be "implemented" (kind like inherited)
//by another class with the implements keyword (instead of extends).

public class Ktm implements Bike 
{
	// Overriding the cost() method
    @Override
    public void cost() {
        System.out.println("KTM cost: 2,00,000 INR");
    }
    
    // Overriding the speed() method
    @Override
    public void speed() {
        System.out.println("KTM speed: 150 km/h");
    }
    
    // Main method to test the class implementation
    public static void main(String[] args) {
        // Create an instance of Ktm
        Ktm myKtm = new Ktm();
        
        // Call the overridden methods
        myKtm.cost();
        myKtm.speed();
    }
}
