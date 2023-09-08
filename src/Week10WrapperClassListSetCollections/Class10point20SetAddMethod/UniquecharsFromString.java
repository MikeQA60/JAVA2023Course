package Week10WrapperClassListSetCollections.Class10point20SetAddMethod;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Description: Write a method called uniqueCharacters() that takes a String as input. The method should return a Set containing all the unique alphanumeric characters present in the input string.



Params: A String input.

Return: A Set of unique characters.



Example:

uniqueCharacters("Hello world!") //Returns [H, e, l, o, w, r, d]



 */
public class UniquecharsFromString {
    public static void main(String[] args) {

    }
    public static Set<Character> uniqueCharacters(String input) {
        // Define a method called uniqueCharacters that takes a string as input.
        // The method returns a Set of Characters containing unique letters and digits from the input string.

        Set<Character> set = new LinkedHashSet<>();
        // Create a Set of Characters named 'set' to store unique letters and digits from the input.

        for (char ch : input.toCharArray()) {
            // Start a loop that iterates through each character in the input string.

            if (Character.isLetterOrDigit(ch)) {
                // Check if the current character is a letter or digit.

                set.add(ch);
                // Add the current character to the 'set' if it's a letter or digit.
            }
        }

        return set;
        // Return the 'set' containing unique letters and digits from the input string.
    }
   // In summary, this code defines a method named uniqueCharacters that takes a string as input.
    // It iterates through each character in the input string and adds unique letters and digits to a Set named set.
    // Characters that are not letters or digits are ignored. The method returns the Set containing unique letters and digits
    // from the input string, maintaining their order of appearance.
}
