package arrays;

import java.util.Arrays;

public class DeleteElement 
{

	public static void main(String[] args) 
	{
        // Original array
        int[] numbers = {1, 2, 3, 4, 5};

        // Index of the element to delete (for example, delete element at index 2)
        int indexToDelete = 2;

        // Check if index is valid
        if (indexToDelete < 0 || indexToDelete >= numbers.length) 
        {
            System.out.println("Invalid index");
        } 
        
        else 
        	
        {
            // Create a new array one size smaller
            int[] newArray = new int[numbers.length - 1];

            // Copy elements before the index to delete
            
            // in this for loop check the value of  indextodelete then stop
            for (int i = 0; i < indexToDelete; i++) 
            {
                newArray[i] = numbers[i];
            }

            // Copy elements after the index to delete
            for (int i = indexToDelete; i < newArray.length; i++)
            {
                newArray[i] = numbers[i + 1];
            }

            // Print the new array
            System.out.println("Original array: " + Arrays.toString(numbers));
            
            System.out.println("Array after deleting element at index " + indexToDelete + ": " + Arrays.toString(newArray));
        }
    }


}
