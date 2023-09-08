package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point14StringBuilderToStringMethod;

public class CountWordsInString {
    public static void main(String[] args) {

    }

    public static int wordCount(String input) {
        // Initialize a counter to keep track of the number of words
        int count = 0;

        // Initialize a boolean flag to track whether we're inside a word
        boolean insideWord = false;

        // Create a StringBuilder named "wordBuilder" to build individual words
        StringBuilder wordBuilder = new StringBuilder();

        // Iterate through the characters of the input string
        for (int i = 0; i < input.length(); i++) {
            // Get the current character
            char currentChar = input.charAt(i);

            // Check if the current character is not a space
            if (currentChar != ' ') {
                // Append the current character to the wordBuilder
                wordBuilder.append(currentChar);

                // Mark that we're inside a word
                insideWord = true;
            } else {
                // If we're inside a word, increment the word count
                if (insideWord) {
                    count++;

                    // Reset the wordBuilder for the next word
                    wordBuilder.setLength(0);

                    // Mark that we're no longer inside a word
                    insideWord = false;
                }
            }
        }

        // If the last character is not a space and a word is ongoing, increment the count
        if (insideWord) {
            count++;
        }

        // Return the total word count
        return count;
    }
}