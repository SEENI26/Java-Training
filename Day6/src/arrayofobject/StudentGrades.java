package arrayofobject;

public class StudentGrades 
{
	public static void main(String[] args) 
	{
        // Array to store grades of students
        double[] grades = {85.5, 92.0, 76.5, 88.0, 79.5};

        // Calculate the average grade
        double sum = 0.0;
        
        for (int i = 0; i < grades.length; i++) 
        {
            sum += grades[i];
        }
        
        // Adding i Value and divide by array length 
        double average = sum / grades.length;

        // Print the average grade
        System.out.println("Average grade: " + average);
    }


}
