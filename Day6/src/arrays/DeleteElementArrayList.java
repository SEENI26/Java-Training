package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementArrayList
{
	public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Delete the element at index 2
        numbers.remove(2);

        // Print the updated list
        System.out.println("ArrayList after deletion: " + numbers);
    }


}
