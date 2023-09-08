package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWords {
    public static void main(String[] args) {

    }
    // Method to count the frequency of words in a given string
    public static Map<String, Integer> countWordFrequency(String words) {
        // Initialize a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the input string into an array of words
        String[] wordArray = words.split(" ");

        // Iterate through the array of words
        for (String word : wordArray) {
            // Get the current frequency of the word or initialize it to 0
            int frequency = wordFrequencyMap.getOrDefault(word, 0);
            // Update the frequency by incrementing it
            wordFrequencyMap.put(word, frequency + 1);
        }

        return wordFrequencyMap; // Return the map with word frequencies

    }

    //This code defines a method named countWordFrequency that takes a string containing words as input. It processes the input, splits it into an array of words, and then iterates through each word. For each word, it updates a frequency count in a HashMap. The main method demonstrates how to call this method with a sample string of words and print the resulting map containing word frequencies.
}
