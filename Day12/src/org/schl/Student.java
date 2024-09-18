package org.schl;

// Encapsulation in java is process of Wrapping data(variable) and method that 
// operate on data into a single unit
public class Student 
{
	// Private fields (data hiding)
    private String name;
    private int age;

    // Public getter method to access private variable 'name'
    public String getName() {
        return name;
    }

    // Public setter method to modify private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method to access private variable 'age'
    public int getAge() {
        return age;
    }

    // Public setter method to modify private variable 'age'
    public void setAge(int age) {
        // Adding validation, another advantage of encapsulation
        if (age > 0) 
        {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}


