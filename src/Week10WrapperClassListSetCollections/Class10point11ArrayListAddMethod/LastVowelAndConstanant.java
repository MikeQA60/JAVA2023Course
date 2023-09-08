package Week10WrapperClassListSetCollections.Class10point11ArrayListAddMethod;

import java.util.ArrayList;
import java.util.List;

public class LastVowelAndConstanant {
    public static void main(String[] args) {

    }

    public static List<Character> lastVowelAndConsonant(String input) {
        // Define a method called lastVowelAndConsonant that takes a string as input.
        // The method returns a List of Characters containing the last vowel and last consonant found in the input string.

        List<Character> result = new ArrayList<>();
        // Create a List of Characters named 'result' to store the last vowel and last consonant.

        for (int i = 0; i < input.length(); i++) {
            // Start a loop that iterates through each character in the input string.

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A'
                    || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O'
                    || input.charAt(i) == 'U') {
                // Check if the current character is a vowel (lowercase or uppercase).

                result.add(input.charAt(i));
                // Add the vowel to the 'result' list.
                break;
                // Exit the loop after finding the first vowel.
            }
        }

        for (int i = input.length() - 1; i > 0; i--) {
            // Start a loop that iterates through each character in reverse order, starting from the end of the input string.

            if (Character.isLetter(input.charAt(i))
                    && input.charAt(i) != 'a'
                    && input.charAt(i) != 'A'
                    && input.charAt(i) != 'e'
                    && input.charAt(i) != 'E'
                    && input.charAt(i) != 'i'
                    && input.charAt(i) != 'I'
                    && input.charAt(i) != 'o'
                    && input.charAt(i) != 'O'
                    && input.charAt(i) != 'u'
                    && input.charAt(i) != 'U') {
                // Check if the current character is a letter and not a vowel (lowercase or uppercase).

                result.add(input.charAt(i));
                // Add the consonant to the 'result' list.
                break;
                // Exit the loop after finding the first consonant.
            }
        }

        return result;
        // Return the 'result' list containing the last vowel and last consonant.

    }
}

//In summary, this code defines a method named lastVowelAndConsonant that takes a string as input.
// It searches the input string to find the last vowel and the last consonant and stores them in a list of characters.
// The first loop searches for the last vowel, and the second loop searches for the last consonant.
// The result is returned as a list of characters.
