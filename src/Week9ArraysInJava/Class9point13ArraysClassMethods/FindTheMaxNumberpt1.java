package Week9ArraysInJava.Class9point13ArraysClassMethods;

public class FindTheMaxNumberpt1 {
    public static void main(String[] args) {

    }

    //The method findMaxWord takes a single input parameter,
    // inputString, which is the string from which we want to find the longest word.
    public static String findMaxWord(String inputString) {

      //  The first conditional statement checks if the inputString is empty. If it's empty

        if (inputString.isEmpty()) {

            // the method immediately returns an empty string "" as there are no words to analyze.
            return "";
        }

        // Split the inputString into an array of words using the specified delimiters
        String[] words = inputString.split("[\\s,.;!?;-]+");

        // Initialize a variable to store the longest word
        String maxWord = "";

        // Iterate through each word in the words array
        for (String word : words) {
            // Compare the length of the current word with the length of the maxWord
            if (word.length() > maxWord.length()) {
                // If the current word is longer, update maxWord with the current word
                maxWord = word;
            }
        }

        // Return the longest word found
        return maxWord;
    }




}
