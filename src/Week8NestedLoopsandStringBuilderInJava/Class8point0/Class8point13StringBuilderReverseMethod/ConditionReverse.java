package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point13StringBuilderReverseMethod;

public class ConditionReverse {
    public static void main(String[] args) {

    }
    public static String reverseString(String input) {
        // Initialize a variable to count the number of space characters
        int spacesCounter = 0;

        // Loop through each character in the input string
        for (int index = 0; index < input.length(); index++) {

            // Check if the current character is a space
            if (input.charAt(index) == ' ') {
                // Increment the spacesCounter if a space is found
                spacesCounter++;
            }
        }
        // Check if the number of spaces is odd
        if (spacesCounter % 2 != 0) {

            // If odd, reverse the input string using StringBuilder and return the reversed string
            return new StringBuilder(input).reverse().toString();

        } else {

            // If even, return "Can't reverse"
            return "Can't reverse";
        }
    }

}
