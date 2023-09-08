package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point5MapContainsKeyMethod;

import java.util.HashMap;
import java.util.Map;

public class CheckUniqueWords {

    public static void main(String[] args) {

    }
    // Method to check duplicate words and create a map of words and their uniqueness
    public static Map<String, Boolean> checkDuplicateWords(String input) {
        // Initialize a HashMap to store words and their corresponding uniqueness
        Map<String, Boolean> wordMap = new HashMap<>();

        // Split the input sentence into an array of words
        String[] words = input.split(" ");

        // Loop through each word in the array
        for (String word : words) {
            Boolean isUnique = false; // Initialize a boolean flag to indicate word uniqueness

            // Check if the word is not already present in the map
            if (!wordMap.containsKey(word)) {
                isUnique = true; // If not present, mark the word as unique
            }

            // Store the word and its uniqueness status in the map
            wordMap.put(word, isUnique);
        }

        return wordMap; // Return the map with words and their uniqueness status

    }
}
//This code defines a method named checkDuplicateWords that takes a sentence as input and creates a map
// where each word is associated with a boolean value indicating whether the word is unique within the sentence.
// It iterates through the words, checks if a word is already present in the map, and updates the uniqueness status accordingly
// . The main method demonstrates how to call this method with a sample sentence and print the resulting map.

