package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point3MapPutMethod;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> countVowels(String input) {
        // Define a method called countVowels that takes a string as input and returns a Map.

        // Create a HashMap named vowelCountMap to store words and their corresponding vowel counts.
        Map<String, Integer> vowelCountMap = new HashMap<>();

        // Split the input string into an array of words using whitespace as the delimiter.
        String[] words = input.split("\\s+");

        // Iterate through each word in the array.
        for (String word : words) {
            // Initialize a variable to count the number of vowels in the current word.
            int vowelCount = 0;

            // Convert the word to lowercase for case-insensitive comparison.
            String lowerCaseWord = word.toLowerCase();

            // Iterate through each character in the lowercase word.
            for (char c : lowerCaseWord.toCharArray()) {
                // Check if the character is a vowel ('a', 'e', 'i', 'o', 'u').
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    // Increment the vowel count if the character is a vowel.
                    vowelCount++;
                }
            }

            // Add the current word and its corresponding vowel count to the map.
            vowelCountMap.put(word, vowelCount);
        }

        // Return the map containing words and their corresponding vowel counts.
        return vowelCountMap;
    }
}
 //   In summary, this code defines a method that takes a string as input, splits it into words,
//   and counts the number of vowels in each word. It stores the words and their vowel counts in a map,
//   where the word is the key and the vowel count is the value. The method then returns the map containing words and
//   their corresponding vowel counts.

