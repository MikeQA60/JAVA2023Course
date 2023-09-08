package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point10PutAllMethod;

import java.util.HashMap;
import java.util.Map;

public class CombinedCheck {
    public static void main(String[] args) {

    }
    // This method takes two sentences as input and returns a map containing word-palindrome pairs and word-capital pairs.
    public static Map<String, Boolean> checkWords(String sentence1, String sentence2) {
        // Create a map to store the result.
        Map<String, Boolean> resultMap = new HashMap<>();

        // Add the results of palindrome check for sentence1 to the resultMap.
        resultMap.putAll(checkPalindrome(sentence1));

        // Add the results of capital check for sentence2 to the resultMap.
        resultMap.putAll(checkCapital(sentence2));

        // Return the combined resultMap.
        return resultMap;
    }

    // This method checks whether each word in a sentence is a palindrome and returns a map with word-palindrome pairs.
    public static Map<String, Boolean> checkPalindrome(String sentence) {
        // Create a map to store word-palindrome pairs.
        Map<String, Boolean> palindromeMap = new HashMap<>();

        // Split the sentence into words using whitespace as the delimiter.
        String[] words = sentence.split("\\s+");

        // Iterate through each word in the sentence.
        for (String word : words) {
            // Convert the word to lowercase and remove non-alphabetic characters.
            String cleanedWord = word.toLowerCase().replaceAll("[^a-z]", "");

            // Initialize a flag to track whether the word is a palindrome.
            boolean isPalindrome = true;

            // Check if the word is a palindrome by comparing characters from both ends.
            for (int i = 0; i < cleanedWord.length() / 2; i++) {

                if (cleanedWord.charAt(i) != cleanedWord.charAt(cleanedWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Add the word-palindrome pair to the palindromeMap.
            palindromeMap.put(word, isPalindrome);
        }

        // Return the palindromeMap.
        return palindromeMap;
    }

    // This method checks whether each word in a sentence starts with a capital letter and returns a map with word-capital pairs.
    public static Map<String, Boolean> checkCapital(String sentence) {
        // Create a map to store word-capital pairs.
        Map<String, Boolean> capitalMap = new HashMap<>();

        // Split the sentence into words using whitespace as the delimiter.
        String[] words = sentence.split("\\s+");

        // Iterate through each word in the sentence.
        for (String word : words) {
            // Check if the word starts with a capital letter.
            boolean startsWithCapital = Character.isUpperCase(word.charAt(0));

            // Add the word-capital pair to the capitalMap.
            capitalMap.put(word, startsWithCapital);
        }

        // Return the capitalMap.
        return capitalMap;
    }
  //  In summary, this code defines three methods to check for palindrome words and words that start
    //  with capital letters in two sentences. The checkWords() method combines the results from the checkPalindrome()
    //  and checkCapital() methods and returns a map with the combined results.
}
