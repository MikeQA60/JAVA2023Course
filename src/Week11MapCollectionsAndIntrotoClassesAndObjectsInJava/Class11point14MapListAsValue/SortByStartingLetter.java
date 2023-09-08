package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point14MapListAsValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByStartingLetter {
    public static void main(String[] args) {

    }

    public static Map<Character, List<String>> separateWordsByStartingLetter(String input) {


        Map<Character, List<String>> resultMap = new HashMap<>();


        String[] words = input.split(" ");

        // Loop through each word in the array of words
        for (String word : words) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Get the first character of the word as the starting letter
                char startingLetter = word.charAt(0);

                // Check if the starting letter is a letter
                if (Character.isLetter(startingLetter)) {
                    // Get the list of words for the current starting letter from the map
                    List<String> wordList = resultMap.getOrDefault(startingLetter, new ArrayList<>());

                    // Remove non-letter characters from the end of the word
                    word = word.replaceAll("[^a-zA-Z]+$", "");

                    // Add the word to the list for the starting letter
                    wordList.add(word);

                    // Update the map with the updated list of words
                    resultMap.put(startingLetter, wordList);
                }
            }
        }

        // Return the map containing words grouped by their starting letters
        return resultMap;
    }
}
  //  This code defines a method called separateWordsByStartingLetter() that takes an input string and
//  separates each word based on their starting letter, while maintaining case sensitivity.
//  The method returns a map where each key represents a unique starting letter, and the value is a list of words that start with that letter
//  . It processes the words in the input string, removes non-letter characters from the end of each word, and groups them in the map.