package org.circle;

public class Rectangle
{
	// Private fields for length and width
    private double length;
    private double width;

    // Constructor to initialize the rectangle
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    // Getter method for length
    public double getLength() 
    {
        return length;
    }

    // Setter method for length
    public void setLength(double length) 
    {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() 
    {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) 
    {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() 
    {
        return length * width;
}
}
