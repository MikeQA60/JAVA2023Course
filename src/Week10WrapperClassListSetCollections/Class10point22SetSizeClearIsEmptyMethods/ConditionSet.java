package Week10WrapperClassListSetCollections.Class10point22SetSizeClearIsEmptyMethods;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConditionSet {
    public static void main(String[] args) {

    }
    public static Set addUniqueChars(String input) {
        // Define a method named addUniqueChars that takes a String as input.
        // The method returns a Set containing unique characters from the input String.

        Set uniqueChars = new LinkedHashSet<>();
        // Create a Set named 'uniqueChars' to store unique characters from the input.

        for (char c : input.toCharArray()) {
            // Start a loop that iterates through each character 'c' in the input String.

            if (Character.isDigit(c)) {
                // Check if the current character is a digit.

                uniqueChars.clear();
                // Clear the 'uniqueChars' set to remove any characters added so far.

                uniqueChars.add('0');
                // Add the character '0' to the 'uniqueChars' set.

                return uniqueChars;
                // Return the 'uniqueChars' set containing only the character '0'.
            }

            if (input.length() == 0) {
                // Check if the input String is empty.

                return new LinkedHashSet<>();
                // Return an empty 'LinkedHashSet'.
            }

            if (c == ' ') {
                // Check if the current character is a space.

                continue;
                // Skip the rest of the loop and move to the next iteration.
            } else if (c == '!' || c == ',' || c == '.' || c == '?' || c == '@' || c == '\'') {
                // Check if the current character is one of the specified punctuation marks.

                uniqueChars.clear();
                // Clear the 'uniqueChars' set to remove any characters added so far.

                return uniqueChars;
                // Return the empty 'uniqueChars' set.
            } else {
                // If the character is not a digit, space, or punctuation mark.

                uniqueChars.add(c);
                // Add the current character to the 'uniqueChars' set.
            }
        }

        return uniqueChars;
        // Return the 'uniqueChars' set containing unique characters from the input String.
    }
    //In summary, this code defines a method named addUniqueChars that takes a String as input.
    // It iterates through each character in the input String, adds unique characters to the uniqueChars set, and
    // performs special handling for specific cases like digits, punctuation marks, and spaces.
    // The method returns the uniqueChars set containing unique characters based on the provided conditions.
}
