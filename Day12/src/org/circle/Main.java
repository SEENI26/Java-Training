package org.circle;

public class Main 
{
	public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(4.5, 2);

        // Accessing properties and methods through getter methods
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        // Calculate and print the area
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
}
}
