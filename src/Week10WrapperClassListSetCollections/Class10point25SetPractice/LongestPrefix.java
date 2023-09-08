package Week10WrapperClassListSetCollections.Class10point25SetPractice;

import java.util.Set;

public class LongestPrefix {
    public static void main(String[] args) {

    }

    public static String findLongestCommonPrefix(Set<String> input) {
        // Define a method called findLongestCommonPrefix that takes a Set of Strings as input.
        // The method returns the longest common prefix among the strings in the set.

        if (input == null || input.size() == 0) {
            return "";
        }
        // Check if the input set is null or empty. If so, return an empty string.

        String[] input2 = input.toArray(new String[0]);
        // Convert the set of strings into an array of strings named input2.

        String longestPrefix = input2[0];
        // Initialize the longestPrefix with the first string in the input2 array.

        for (int c = 0; c < longestPrefix.length(); c++) {
            // Start a loop that iterates through each character 'c' in the longestPrefix.

            for (int i = 1; i < input2.length; i++) {
                // Start an inner loop that iterates through each string 'i' in the input2 array.

                if (c >= input2[i].length() || longestPrefix.charAt(c) != input2[i].charAt(c)) {
                    // Check if the index 'c' is out of bounds for the current string or if characters at index 'c' are not equal.

                    return longestPrefix.substring(0, c);
                    // Return the substring of longestPrefix from index 0 to 'c' (exclusive).
                }
            }
        }
        // The loops ensure that the common prefix is being checked character by character.

        return longestPrefix;
        // If the loops complete without returning a substring, return the entire longestPrefix.
    }
   // In summary, this code defines a method that finds the longest common prefix among a set of strings.
    // It iterates through each character position in the longest prefix string and checks if the corresponding characters
    // in the other strings match. If a mismatch is found or the current index is out of bounds for any string,
    // the code returns the common prefix up to that point. If no mismatches are found, the entire longest prefix is returned.
}
