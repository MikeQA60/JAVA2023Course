package Week10WrapperClassListSetCollections.Class10point23SetContainsMethod;

/*
Description: Write a method called checkWord() that takes a Set of strings and a String. T
he method should return boolean of case-insensitive presence of the word in a set.



Params: A Set of Strings, a String.

Return: The boolean



Example:

checkWord([apple, banana, orange, avocado], Apple) //Returns true


Ex1

Input:

apple banana avocado apple banana orange

orange

Output: true
 */
import java.util.Set;

public class CheckTheWord {

    public static void main(String[] args) {

    }
    // Define a method called checkWord that takes a Set of Strings and a String as input.
    // The method returns a boolean indicating case-insensitive presence of the word in the set.
    public static boolean checkWord(Set<String> wordSet, String word) {


        for (String item : wordSet) { // Iterate through each item in the wordSet.

            if (item.equalsIgnoreCase(word)) { // Check if the current item is equal to the word (case-insensitive).

                return true; // Return true if the word is found in the set.
            }
        }

        return false; // Return false if the word is not found in the set.
    }
}
   // This code defines a method named checkWord that takes a Set of Strings and a String as input.
// It iterates through each item in the set and checks if the provided word (case-insensitive) is equal to any of the items.
// If a match is found, it returns true; otherwise, it returns false. The example in the main method demonstrates how to use the method.









