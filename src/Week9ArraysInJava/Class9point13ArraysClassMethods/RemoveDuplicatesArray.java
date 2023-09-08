package Week9ArraysInJava.Class9point13ArraysClassMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Description: Write a method called removeDuplicatesFromString() that takes a String as input.
The method should split the input string into an array of Strings using spaces and/or newlines as delimiters.
It should then remove all occurrences of the word if it's repeated more than one time, regardless of case, spaces at the beginning
or at the end.

Params: A String.

Return: A String array with all duplicates removed.

Example:

String inputString = "The quick brown fox jumps over the lazy dog\nThe lazy dog is quick";
String[] result = removeDuplicatesFromString(inputString); // Returns ["brown", "fox", "jumps", "over", "is"]

Note: If the input string is empty, return an empty array.
 */
public class RemoveDuplicatesArray {
    public static void main(String[] args) {

    }
    public static String[] removeDuplicatesFromString(String inputString) {
        // Return an empty array if the input string is empty
        if (inputString.isEmpty()) {
            return new String[0];
        }

        // Split the input string into an array of strings using spaces and/or newlines as delimiters
        String[] words = inputString.split("[\\s\\n]+");


        // Create a map to store the count of each word
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word, ignoring case and spaces at the beginning or end
        for (String word : words) {
            // Remove spaces at the beginning and end of the word
            word = word.trim();


            // Convert the word to lowercase to ignore case when comparing
            String lowercaseWord = word.toLowerCase();

            // Update the count for the lowercase word in the map
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Create a list to store unique words (occurring only once)
        List<String> uniqueWords = new ArrayList<>();

        // Add the words to the list if they occur only once
        for (String word : words) {
            // Remove spaces at the beginning and end of the word
            word = word.trim();


            // Convert the word to lowercase to ignore case when comparing
            String lowercaseWord = word.toLowerCase();


            // Add the word to the list if its count is 1 in the map
            if (wordCountMap.get(lowercaseWord) == 1 && !lowercaseWord.equals("")){
                uniqueWords.add(word);


            }
        }

        // Convert the list back to an array and return it
        return uniqueWords.toArray(new String[0]);
    }
}
