package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point7MapReplaceMethod;

/*
Description: Implement a method named manageMap() that accepts a String input.
The method's objective is to construct a map where the keys are Integers starting from 1, and the values are
Strings representing full names. The names in the input string are separated by semicolons.
After the assignment sort each value so that longer word comes first.

Params: String.

Return: Map with the full names, where values are rearranged so that longer words appear first.

Example:

String names = "Chris Brad; Tom Misch; Kate Stewart"

manageMap(names) // Returns {1:Chris Brad, 2:Misch Tom, 3:Stewart Kate}

Note: map should be ordered by the key.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class ManageListOfNAmes {
    public static void main(String[] args) {

    }
    public static Map<Integer, String> manageMap(String sentenceOfFullNames) {
        // Split the input sentence into an array of full names using ';' and spaces as delimiters
        String[] fullNames = sentenceOfFullNames.trim().split(";+\\s+");

        // Create a map to store numbered full names
        Map<Integer, String> numberedFullNamesMap = new LinkedHashMap<>();

        // Declare variables to hold first and last names
        String firstName;
        String lastName;

        // Initialize a counter for numbering the full names
        int counter = 1;

        // Iterate through each full name in the array
        for (String fullName : fullNames) {
            // Split the full name into first and last names using spaces
            String[] firstAndLastNames = fullName.split("\\s");

            // Extract the first name
            firstName = firstAndLastNames[0];

            // Extract the last name
            lastName = firstAndLastNames[1];

            // Compare the lengths of first and last names
            if (firstName.length() > lastName.length()) {
                // If first name is longer, concatenate first and last names and put in the map
                numberedFullNamesMap.put(counter, firstName.concat(" ").concat(lastName));
            } else {
                // If last name is longer or lengths are equal, concatenate last and first names and put in the map
                numberedFullNamesMap.put(counter, lastName.concat(" ").concat(firstName));
            }

            // Increment the counter for the next entry
            counter++;
        }

        // Return the map containing numbered full names
        return numberedFullNamesMap;
    }
   // This code takes a sentence containing full names separated by semicolons and spaces,
    // processes each name to determine whether the first name or last name is longer, and then
    // stores the concatenated full names along with their corresponding numbers in a map. The Map returned by the method maintains the order of insertion, as it's implemented using LinkedHashMap.
}
