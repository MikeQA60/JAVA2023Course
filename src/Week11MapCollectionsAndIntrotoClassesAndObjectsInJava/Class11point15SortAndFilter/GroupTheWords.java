package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point15SortAndFilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupTheWords {

    public static void main(String[] args) {

    }
    public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> inputMap) {

        // Create a new map to store the result
        Map<Integer, Integer> result = new HashMap<>();

        // Loop through each string in the list

        for (Map.Entry<String, List<String>> entry : inputMap.entrySet()) {

            // Get the list of strings from the current entry's value
            List<String> strings = entry.getValue();

            // Loop through each string in the list
            for (String string : strings) {

                // Get the length of the current string
                int length = string.length();

                // Check if the length is already a key in the result map

                if (result.containsKey(length)) {

                    // If yes, increment the count by 1
                    result.put(length, result.get(length) + 1);

                } else {
                    // If no, add a new entry with length as key and count as 1
                    result.put(length , 1);
                }
            }
        }

        // Return the map containing lengths as keys and their counts as values

        return  result;
    }
}

//public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> inputMap) {:
// This is the method signature. It takes a map of strings to lists of strings as input and returns a map of integers to integers.
//
//Map<Integer, Integer> result = new HashMap<>();: Initializes an empty result map that will store the length of strings as keys
// and the count of strings with that length as values.
//
//The first loop iterates through each entry in the inputMap.
//
//List<String> strings = entry.getValue();: Retrieves the list of strings from the current entry's value.
//
//The second loop iterates through each string in the strings list.
//
//int length = string.length();: Calculates the length of the current string.
//
//Inside the loop, the code checks whether the length is already a key in the result map.
//
//If the length is already a key, it increments the count associated with that length by 1.
//
//If the length is not a key, it adds a new entry to the result map with the length as the key and a count of 1 as the value.
//
//After processing all strings in the list, the method returns the result map containing the lengths of strings as keys
// and their corresponding counts as values.
