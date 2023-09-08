package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point14MapListAsValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexSorting {

    public static void main(String[] args) {

    }
    public static Map<String, List<String>> sortWordsIntoCategories(String str) {
        // Define a method called sortWordsIntoCategories that takes a String input.

        // Create a HashMap to store categories and corresponding word lists.
        Map<String, List<String>> myMap = new HashMap<>();

        // Create lists to hold words for different categories.
        List<String> hasUpperCase = new ArrayList<>();
        List<String> allLowerCase = new ArrayList<>();
        List<String> hasSpecialChar = new ArrayList<>();
        List<String> hasDigit = new ArrayList<>();

        // A variable to store lowercase version of the input string.
        String allLower = "";

        // Split the input string into an array of words.
        String[] words = str.split(" ");

        // Loop through each word in the array.
        for (String word : words) {
            // Check if the word has uppercase letters.
            if (!word.equals(word.toLowerCase())) {
                hasUpperCase.add(word);
                myMap.put("Has Uppercase", hasUpperCase);
            }
            // Check if the word has non-alphanumeric characters.
            if (!word.matches("[a-zA-Z0-9]+")) {
                hasSpecialChar.add(word);
                myMap.put("Has Special Character", hasSpecialChar);
            }
            // Check if the word contains digits.
            if (word.matches(".*\\d.*")) {
                hasDigit.add(word);
                myMap.put("Has Digit", hasDigit);
            }
            // Check if the word is all lowercase.
            if (word.equals(word.toLowerCase())) {
                allLowerCase.add(word);
                myMap.put("All Lowercase", allLowerCase);
            }
        }

        // Return the populated map containing categorized word lists.
        return myMap;
    }
   // In summary, this code defines a method that categorizes words from an input string into different
    // categories based on whether they have uppercase letters, special characters, digits, or are all lowercase.
    // It uses a HashMap to store category names as keys and lists of words as values.
    // It iterates through the words in the input string, checks their properties, and populates the respective lists and map entries. The final map is returned with categorized word lists.
}
