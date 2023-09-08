package Week10WrapperClassListSetCollections.Class10point13ArrayListSizeMethod;

/*
Description: Write a method called filterAnimals() that takes an array of animal names and a specific letter as input.
 The method should filter out the animal names that start with the given letter and return them as a List of type
 String regardless of the case.

Params: An array of animal names (strings) and a specific letter (string).

Return: A List of animal names (strings) that start with the given letter.

Example:

String[] animalNames = {"Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"};

filterAnimals(animalNames, "L"); // Returns ["Lion", "Leopard"]

filterAnimals(animalNames, "E"); // Returns ["Elephant"]

filterAnimals(animalNames, "G"); // Returns ["Giraffe"]

Note: If no elements are found, return an empty list.
 Enter names with space and a letter on a new line for testing.
  If the input letter is not alphabetic return list with 'Not allowed' text.
 */
import java.util.ArrayList;
import java.util.List;

public class FilterAnimals {
    public static void main(String[] args) {

    }
    // Define a method called filterAnimals that takes an array of strings (input) and a string (letter) as input.
    // The method returns a List of Strings containing words from the input that start with the specified letter.
    public static List<String> filterAnimals(String[] input, String letter) {


        // Create a List of Strings named 'filteredWords' to store the words that match the criteria.
        List<String> filteredWords = new ArrayList<>();


        // Get the first character of the input letter string.
        char ch = letter.charAt(0);


        // Check if the input letter is not an alphabetic character.
        if (!Character.isLetter(ch)) {


            // If the letter is not alphabetic, add "Not allowed" to the 'filteredWords' list.
            filteredWords.add("Not allowed");

            // Return the list containing only "Not allowed".
            return filteredWords;

        }

        // Start a loop that iterates through each element (word) in the 'input' array.
        for (String element : input) {


            // Compare the lowercase form of the current element's first character
            // with the lowercase form of the input letter's first character.
            if (element.toLowerCase().startsWith(letter.toLowerCase())) {


                // If the element starts with the specified letter (case-insensitive), add it to the 'filteredWords' list.
                filteredWords.add(element);

            }
        }

        // Return the 'filteredWords' list containing words that start with the specified letter.
        return filteredWords;

    }
   // In summary, this code defines a method named filterAnimals that filters words from an array of strings
    // based on whether they start with the specified letter. It handles cases where the input letter is not alphabetic and
    // adds "Not allowed" to the result list. The method is case-insensitive and returns a list of filtered words that match the criteria.


}
