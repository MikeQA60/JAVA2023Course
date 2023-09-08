package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.HashMap;
import java.util.Map;

public class ChecktheWordTypept1 {
    public static void main(String[] args) {

    }
    // Method to check word characters and return a map of words and their characteristics
    public static Map<String, Boolean> checkWordCharacters(String input) {
        // Create a map to store words and their characteristics (true/false)
        Map<String, Boolean> charMap = new HashMap<>();
        // Split the input sentence into an array of words based on spaces
        String[] wordArr = input.split("\\s+");

        // Loop through each word in the array
        for (String word : wordArr) {
            // Initialize flags to track the presence of different character types
            boolean containsUpperCase = false;
            boolean containsDigit = false;
            boolean containsSpecial = false;

            // Loop through each character in the current word
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                // Check if the character is an uppercase letter
                if (Character.isUpperCase(c)) {
                    containsUpperCase = true;
                }
                // Check if the character is a digit
                else if (Character.isDigit(c)) {
                    containsDigit = true;
                }
                // Check if the character is neither a letter nor whitespace
                else if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    containsSpecial = true;
                }
            }

            // Determine if the word contains any uppercase letters, digits, or special characters
            boolean result = containsUpperCase || containsDigit || containsSpecial;
            // Add the word and its result to the charMap
            charMap.put(word, result);
        }

        // Return the map containing word-character type pairs
        return charMap;
    }
}
