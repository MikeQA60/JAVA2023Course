package Week10WrapperClassListSetCollections.Class10point20SetAddMethod;

import java.util.LinkedHashSet;
import java.util.Set;

public class DigitsFromString {
    public static void main(String[] args) {

    }
    public static Set<Integer> parseUniqueDigits(String input) {
        // Define a method called parseUniqueDigits that takes a String as input.
        // The method returns a Set containing unique numbers from the input String.

        String[] split = input.split("[ ,.;:!?$%^&*#@]");
        // Split the input String into an array of substrings using specified delimiters.
        // Delimiters include space, comma, period, semicolon, exclamation mark, question mark,
        // dollar sign, percent sign, caret, ampersand, asterisk, and hash.

        Set<Integer> numbersList = new LinkedHashSet<>();
        // Create a Set of Integers named 'numbersList' to store unique numbers from the input.

        for (Integer i = 0; i < split.length; i++) {
            // Start a loop that iterates through each element in the 'split' array.

            for (Integer j = 0; j < split[i].length(); j++) {
                // Start another loop that iterates through each character in the current element.

                if (Character.isDigit(split[i].charAt(j))) {
                    // Check if the current character is a digit.

                    numbersList.add(Integer.parseInt(split[i]));
                    // Convert the entire current element to an Integer and add it to the 'numbersList' set.
                    // Note: This should be Integer.parseInt(split[i]) instead of split[i].

                }
            }
        }

        return numbersList;
        // Return the 'numbersList' set containing unique numbers from the input String.
    }
   // In summary, this code defines a method named parseUniqueDigits that takes a String as input.
    // It splits the input String into an array of substrings using specified delimiters, then iterates through the array
    // and each character in the substrings. If a character is a digit, it attempts to add the entire substring
    // (which is expected to be a number) to the numbersList set. There's a minor issue where Integer.parseInt(split[i])
    // should be used instead of split[i] in the numbersList.add() line to correctly parse and add the number.





}
