package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.HashMap;

public class ChecktheWordtypept2 {
    public static void main(String[] args) {

    }

    // Method to check word characters and create a map of words and their properties
    public static HashMap<String, Boolean> checkWordCharacters(String input) {
        // Initialize a HashMap to store words and their corresponding properties
        HashMap<String, Boolean> charMap = new HashMap<>();

        // Split the input sentence into an array of words
        String[] wordArr = input.split(" ");

        // Loop through each word in the array
        for (String word : wordArr) {
            // Remove any whitespace from the word
            word = word.replaceAll("\\s", "");

            // Loop through each character in the word
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                // Check if the character is a digit, uppercase letter, or not a letter
                if (Character.isDigit(c) || Character.isUpperCase(c) || !Character.isLetter(c)) {
                    // If any of the above conditions are met, set the property to true
                    charMap.put(word, true);
                } else if (!word.equals(word.toLowerCase())) {
                    // If the word contains at least one uppercase letter, set the property to true
                    charMap.put(word, true);
                } else {
                    // If none of the above conditions are met, set the property to false
                    charMap.put(word, false);
                }
            }
        }
        return charMap; // Return the map with words and their properties
    }
}
  //  This code defines a method named checkWordCharacters that takes a sentence as input and creates a map where each word is associated with a boolean value indicating whether the word contains uppercase letters, numeric digits, or special characters. It goes through each character of each word, applies various conditions, and populates the map accordingly. The main method demonstrates how to call this method with a sample sentence and print the resulting map.
