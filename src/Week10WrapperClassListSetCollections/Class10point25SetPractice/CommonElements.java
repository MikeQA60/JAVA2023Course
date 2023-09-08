package Week10WrapperClassListSetCollections.Class10point25SetPractice;

/*
Description: Write a method called commonEl() that takes two sets of Strings.
The method should return an array with common elements.


Params: A Set of Strings, a Set of Strings.

Return: An array of Strings.


Example:

Set1 = [word1, word3, word5]

Set2 = [word2, word3, word4]

commonEl(Set1, Set2) //Returns [word3]


Ex1

Input:

word1 word2 word3 word4

word2 word4 word5 word6

Output: [word2, word4]
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {

    }
    public static String[] commonEl(Set<String> set1, Set<String> set2) {
        // Define a method called commonEl that takes two Sets of Strings as input.
        // The method returns an array containing common elements between the two Sets.

        List<String> commonList = new ArrayList<>();
        // Create a List to store the common elements.

        for (String element : set1) {
            // Iterate through each element in the first set.

            if (set2.contains(element)) {
                // Check if the current element is also in the second set.

                commonList.add(element);
                // Add the common element to the commonList.
            }
        }

        String[] commonElements = commonList.toArray(new String[0]);
        // Convert the commonList to an array of Strings.

        return commonElements;
        // Return the array of common elements.
    }
}

