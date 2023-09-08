package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point11MapKeySetMethod;

import java.util.Map;

public class OddLengthPt1 {
    public static void main(String[] args) {

    }
    public static int countUnevenValues(Map<Integer, String> map) {
        // Initialize a counter to keep track of uneven (odd) values
        int count = 0;

        // Iterate through the values of the map using a for-each loop
        for (String value : map.values()) {
            // Remove spaces, commas, and periods from the value using regex
            String cleanedValue = value.replaceAll("[\\s,.]", ""); //Remove whitespace, comma, and dot characters

            // Check if the length of the cleaned value is odd
            if (cleanedValue.length() % 2 != 0) {
                count++; // Increment the count if the value's length is odd
            }
        }

        // Return the final count of uneven values
        return count;
    }

//
//    The method countUnevenValues takes a single parameter: a Map<Integer, String> named map.
//
//    Inside the method, an integer variable named count is initialized to keep track of the number of uneven (odd-length) values.
//
//    A loop iterates through the values of the map using a for-each loop with the type String.
//
//    Inside the loop, the value is cleaned by removing spaces, commas, and periods using the replaceAll method and a regex pattern [\\s,.].
//
//    The condition checks if the length of the cleaned value is odd (length % 2 != 0).
//
//    If the condition is met, the count variable is incremented by 1.
//
//    After iterating through all values, the final count of uneven values is returned.
//
//    In summary, the method counts the number of values in the given map where the length of the value, after removing spaces, commas, and periods, is odd, and returns this count.
}
