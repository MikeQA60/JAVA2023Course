package Week10WrapperClassListSetCollections.Class10point15ArrayListRemoveMethod;

/*
Description: Write a method called removeNegativeNumbers() that takes an ArrayList of integers as input.
 The method should remove all negative numbers from the list and return the updated list.



Params: An ArrayList of integers.

Return: An ArrayList of integers with negative numbers removed.



Example:

ArrayList<Integer> numbers = {10, -5, 7, -2, 0}

removeNegativeNumbers(numbers) // Return [10, 7, 0]



Note:

The removeNegativeNumbers() method should iterate through the list, check each number, and remove any negative numbers encountered.

After removing negative numbers, the method should return the updated list.

If the input list is empty or doesn't contain any negative numbers, the method should return the same list without any changes.


Ex1

Input: 10 0 8 -7 -10 10 -20 0

Output: [10, 0, 8, 10, 0]


Ex2

Input: -999 0 1 -1 1000

Output: [0, 1, 1000]
 */
import java.util.ArrayList;
public class DeleteNegativeNumbers {

    public static void main(String[] args) {

    }
    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> list) {
        // Define a method called removeNegativeNumbers that takes an ArrayList of integers (list) as input.
        // The method removes all negative numbers from the list and returns the updated list.

        ArrayList<Integer> updatedList = new ArrayList<>();
        // Create a new ArrayList named 'updatedList' to store the updated numbers.

        for (Integer number : list) {
            // Start a loop that iterates through each element (number) in the input list.

            if (number >= 0) {
                // Check if the number is non-negative.

                updatedList.add(number);
                // If the number is non-negative, add it to the 'updatedList'.
            }
        }

        return updatedList;// Return the 'updatedList' containing non-negative numbers.
    }
}

