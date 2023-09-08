package Week10WrapperClassListSetCollections.Class10point22SetSizeClearIsEmptyMethods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingTheString {
    public static void main(String[] args) {

    }
    public static Set<String> sortCharacters(String input) {
        // Define a method called sortCharacters that takes a String as input.
        // The method returns a Set containing sorted characters based on certain categories.

        Set<String> upperCase = new TreeSet<>();
        Set<String> lowerCase = new TreeSet<>();
        Set<String> numbers = new TreeSet<>();
        Set<String> specialChars = new TreeSet<>();
        // Create four Sets to store characters based on their categories: upper case, lower case, numbers, and special characters.

        int sumOfNumbers = 0;
        // Initialize a variable to store the sum of numeric characters encountered.

        for (char c : input.toCharArray()) {
            // Start a loop that iterates through each character 'c' in the input String.

            if (c == '*') {
                return new HashSet<>();
                // If the current character is '*', return an empty HashSet.
            }

            if (Character.isUpperCase(c)) {
                upperCase.add(String.valueOf(c));
                // If the character is an upper case letter, add it to the 'upperCase' Set.

            } else if (Character.isLowerCase(c)) {
                lowerCase.add(String.valueOf(c));
                // If the character is a lower case letter, add it to the 'lowerCase' Set.

            } else if (Character.isDigit(c)) {
                numbers.add(String.valueOf(c));
                // If the character is a digit, add it to the 'numbers' Set.
                sumOfNumbers += Character.getNumericValue(c);
                // Add the numeric value of the character to the sumOfNumbers.

            } else if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)) {
                specialChars.add(String.valueOf(c));
                // If the character is neither a digit nor a letter nor a whitespace, add it to the 'specialChars' Set.
            }
        }

        Set<String> sortedSet = new LinkedHashSet<>();
        // Create a new Set named 'sortedSet' to store characters in a sorted order.

        sortedSet.addAll(upperCase);
        sortedSet.addAll(lowerCase);
        sortedSet.addAll(numbers);
        sortedSet.addAll(specialChars);
        // Add all characters from different category Sets to the 'sortedSet'.

        if (sumOfNumbers % 2 == 0) {
           // return Set.of(String.valueOf(sortedSet.size()));
            // If the sum of numbers is even, return a Set containing the size of the 'sortedSet' as a single element.
        }

        return sortedSet;
        // Return the 'sortedSet' containing sorted characters based on their categories.
    }
   // In summary, this code defines a method that sorts characters from a given input string into different categories:
    // upper case letters, lower case letters, numbers, and special characters. It then assembles a new set named sortedSet
    // that contains characters from these categories in a sorted order. Depending on the sum of numeric characters encountered,
    // the code either returns the size of the sorted set as a single element or returns the sorted set itself.
}


