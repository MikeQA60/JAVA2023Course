package Week10WrapperClassListSetCollections.Class10point25SetPractice;

import java.util.Set;

public class LongestPrefixpt2 {
    public static void main(String[] args) {

    }
    public static String findLongestCommonPrefix(Set<String> strings) {
        // Define a method called findLongestCommonPrefix that takes a Set of Strings as input.
        // The method returns the longest common prefix among the strings in the set.

        if (strings == null || strings.isEmpty()) {
            return "";
        }
        // Check if the input set is null or empty. If so, return an empty string.

        // If there is only one string in the set, it is the common prefix
        if (strings.size() == 1) {
            return strings.iterator().next();
        }
        // If there's only one string in the set, return that string as the common prefix.

        // Find the shortest string in the set to avoid IndexOutOfBoundsException
        String shortestString = strings.iterator().next();
        // Initialize the shortestString with the first string in the set.

        for (String str : strings) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }
        // Iterate through the strings to find the shortest string.

        StringBuilder commonPrefix = new StringBuilder();
        // Initialize a StringBuilder named commonPrefix to build the common prefix.

        for (int i = 0; i < shortestString.length(); i++) {
            char currentChar = shortestString.charAt(i);
            // Get the character at the current position 'i' in the shortest string.

            for (String str : strings) {
                if (str.charAt(i) != currentChar) {
                    // Check if the character at the same position 'i' in other strings doesn't match.
                    // If not, return the common prefix found so far.
                    return commonPrefix.toString();
                }
            }
            // All strings have the same character at the current position, so add it to the common prefix.
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
        // Return the common prefix built using the StringBuilder.
    }
}
