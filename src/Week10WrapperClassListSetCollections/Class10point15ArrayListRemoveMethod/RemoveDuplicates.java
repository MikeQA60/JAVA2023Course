package Week10WrapperClassListSetCollections.Class10point15ArrayListRemoveMethod;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // Define a method called removeDuplicates that takes an ArrayList of integers (list) as input.
        // The method returns a new ArrayList containing only the unique elements from the input list.

        ArrayList<Integer> result = new ArrayList();
        // Create a new ArrayList named 'result' to store the unique elements.

        for (Integer number : list) {
            // Start a loop that iterates through each element (number) in the input list.

            if (list.indexOf(number) == list.lastIndexOf(number)) {
                // Check if the first occurrence index is the same as the last occurrence index of the number.

                result.add(number);
                // If the number occurs only once in the list, add it to the 'result' list.
            }
        }

        return result; // Return the 'result' list containing only the unique elements.
    }
}

//In summary, this code defines a method named removeDuplicates that takes an ArrayList
// of integers (list) as input. It iterates through each number in the list and checks whether the
// number occurs only once in the list (no duplicates).
// If a number has a first occurrence index that matches its last occurrence index, it means the number is unique,
// so it's added to the result list. The result is a new ArrayList containing only the unique elements from the input list.