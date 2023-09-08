package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point6MapRemoveMethod;

import java.util.TreeMap;

public class PrepareNumberspt2 {
    public static void main(String[] args) {

    }
    // Method to classify and deduplicate integers from input
    public static TreeMap<Integer, String> classifyAndDeduplicateIntegers(String input) {
        // Split the input string into an array of strings representing integers
        String[] inputArrString = input.split(" ");
        // Initialize a TreeMap to store deduplicated integers and their classifications
        TreeMap<Integer, String> output = new TreeMap<>();
        // Initialize an array to store integers
        int[] intArr = new int[inputArrString.length];

        // Parse the input strings to an array of integers
        for (int i = 0; i < inputArrString.length; i++) {
            intArr[i] = Integer.parseInt(inputArrString[i]);
        }

        // Iterate through the array of integers
        for (int num : intArr) {
            if (output.containsKey(num)) { // If the number is already in the map
                output.remove(num); // Remove it (deduplicate)
            } else {
                // Classify and add the number to the map with its classification
                if (num > 0 && num % 2 == 0) {
                    output.put(num, "Positive Even");
                } else if (num > 0) {
                    output.put(num, "Positive Odd");
                } else if (num < 0) {
                    output.put(num, "Negative");
                } else {
                    output.put(num, "Zero");
                }
            }
        }

        return output; // Return the TreeMap containing deduplicated integers and their classifications
    }

}
