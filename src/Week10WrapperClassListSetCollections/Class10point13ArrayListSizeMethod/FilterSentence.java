package Week10WrapperClassListSetCollections.Class10point13ArrayListSizeMethod;

/*
Description: Write a method called filterWords() that takes a String array as input.
The method should filter out the words that meet either of the following conditions:

Words that have a length greater than 5 characters

Words that contain between one and three (inclusive) special characters (non-alphanumeric characters)

Params: A String array.

Return: A List containing the filtered words.

Example:

String[] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};

filterWords(words); // Returns ["World!", "@OpenAI", "Chatbot", "Test123", "$$"]

Note:

Special characters include any non-alphanumeric characters (e.g., symbols, punctuation marks).

The order of elements should be maintained.

If no elements are found, an empty ArrayList should be returned.

The comparison should be case-sensitive.
 */

import java.util.ArrayList;
import java.util.List;

public class FilterSentence {
    public static void main(String[] args) {

    }
    public static List<String> filterWords(String[] array) {
        // Define a method called filterWords that takes an array of strings as input.
        // The method returns a List of strings containing elements that meet specific criteria.

        List<String> newList = new ArrayList<>();
        // Create a new List of strings named 'newList' to store filtered words.

        for (String str : array) {
            // Start a loop that iterates through each element (str) in the input array.

            int specChar = 0;
            // Initialize a variable 'specChar' to count special characters in the current element.

            for (char c : str.toCharArray()) {
                // Start a loop that iterates through each character (c) in the current element (str).

                if (!Character.isLetterOrDigit(c)) {
                    // Check if the current character is neither a letter nor a digit.

                    specChar++;
                    // Increment the count of special characters.
                }
            }

            if (specChar >= 1 && specChar <= 3 || str.length() > 5) {
                // Check if the number of special characters is between 1 and 3 (inclusive)
                // OR if the length of the string is greater than 5.

                newList.add(str);
                // If the conditions are met, add the current element (str) to the 'newList'.
            }
        }

        return newList;
        // Return the 'newList' containing elements that meet the specified criteria.
    }
    //In summary, this code defines a method named filterWords that takes an array of strings as input.
    // It processes each element in the array to count the number of special characters (characters that are neither letters nor digits).
    // If an element has between 1 and 3 special characters or has a length greater than 5, it's added to the result list.
    // The method returns a list of strings that meet the specified criteria.

}
