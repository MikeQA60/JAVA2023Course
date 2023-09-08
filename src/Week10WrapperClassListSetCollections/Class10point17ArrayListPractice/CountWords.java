package Week10WrapperClassListSetCollections.Class10point17ArrayListPractice;

import java.util.ArrayList;

public class CountWords {
    public static void main(String[] args) {

    }

    public static int countWordsStartingWith(ArrayList<String> words, String letter) {
        // Define a method named countWordsStartingWith that takes an ArrayList of Strings (words)
        // and a specific letter (letter) as input.
        // The method counts the number of words that start with the given letter (case-insensitive)
        // and returns the count.

        int count = 0; // Initialize the count of words starting with the given letter.

        for (String word : words) {
            // Iterate through each word in the ArrayList.

            if (word.toLowerCase().startsWith(letter.toLowerCase())) {
                // Check if the lowercase version of the word starts with the lowercase version of the letter.

                count++;
                // Increment the count since the word starts with the given letter.
            }
        }

        return count;
        // Return the count of words starting with the given letter.
    }

}

//This code defines a method countWordsStartingWith that takes an ArrayList of Strings (words) and a specific letter (letter) as input.
// It iterates through each word in the ArrayList and checks whether the lowercase version of the word starts with the lowercase version
// of the given letter. If so, it increments the count.
// The provided main method demonstrates how to use the countWordsStartingWith method with example input
// and prints the count of words starting with the specified letters.
