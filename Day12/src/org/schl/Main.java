package org.schl;

public class Main 
{
	public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();
        
        // Setting values using setter methods
        student.setName("John Doe");
        student.setAge(20);
        
        // Getting values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

}
