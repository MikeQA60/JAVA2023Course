package Week10WrapperClassListSetCollections.Class10point12ArrayListGetMethod;

/*
Description: Write a method called getListElement() that takes an ArrayList of integers and an index as input
. The method should return the element at the specified index in the list.

Params: An ArrayList of integers, an index (int).
(For testing: enter numbers in one line separated by space to create a List of numbers. Enter index on new line)

Return: The element at the specified index in the List.

Example:

getListElement([1, 2, 3, 4, 5], 2) // Returns 3

getListElement([10, 20, 30, 40], 3) // Returns 40

getListElement([5, 10, 15, 20], 0) // Returns 5

Note: The index is zero-based, so the first element is at index 0. If the index is negative return -1.
 */
import java.util.ArrayList;

public class ReturnTheElementOnIndex {
    public static void main(String[] args) {


    }
    // Define a method called getListElement that takes an ArrayList of integers and an index as input.
    // It returns the element at the specified index in the list.
    public static int getListElement(ArrayList<Integer> list, int index) {


        // Check if the index is out of bounds (negative or greater than/equal to the list size).
        if (index < 0 || index >= list.size()) {

            // In these cases, return -1.
            return -1;
        }

        // Return the element at the specified index in the list.
        return list.get(index);

    }

}
