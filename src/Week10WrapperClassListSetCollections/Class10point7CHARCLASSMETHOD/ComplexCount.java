package Week10WrapperClassListSetCollections.Class10point7CHARCLASSMETHOD;

/*
Description: Write a method called countCharacterTypes() that takes a string as input.
The method should count the number of alphabetic characters, digits, whitespace characters, and
special characters (non-alphabetic, non-digit, and non-whitespace) in the string.
The counts should be stored in an array of integers and returned.

Params: A string.

Return: An array of integers representing the count of each character type.

Example:

countCharacterTypes("Hello 123 World!") // Returns [10, 3, 2, 1]

Explanation: The input string contains 10 alphabetic characters, 3 digits, 2 whitespace characters, and 1 special character.

Note: If the input string is empty, the method should return an array of zeros.
 */
public class ComplexCount {
    public static void main(String[] args) {

    }
    public static int[] countCharacterTypes(String input) {
        // Define a method called countCharacterTypes that takes a string as input.
        // The method counts and categorizes the characters in the input string and returns an array of counts.

        int[] counts = new int[4];
        // Create an integer array 'counts' to store the counts of different character types.
        // The array has 4 slots for: letters, digits, whitespace characters, and other characters.

        for (int i = 0; i < input.length(); i++) {
            // Start a loop that iterates through each character in the input string.

            if (Character.isLetter(input.charAt(i))) {
                // Check if the current character is a letter.

                counts[0]++;
                // Increment the count for letters in the 'counts' array.
            } else if (Character.isDigit(input.charAt(i))) {
                // If the current character is not a letter, check if it's a digit.

                counts[1]++;
                // Increment the count for digits in the 'counts' array.
            } else if (Character.isWhitespace(input.charAt(i))) {
                // If the current character is neither a letter nor a digit, check if it's whitespace.

                counts[2]++;
                // Increment the count for whitespace characters in the 'counts' array.
            } else {
                // If the current character is not a letter, digit, or whitespace, it's considered other.

                counts[3]++;
                // Increment the count for other characters in the 'counts' array.
            }
        }

        return counts;
        // Return the 'counts' array containing the counts of different character types.
    }
}

//In summary, this code defines a method named countCharacterTypes that takes a string as input.
// It goes through each character in the input string and categorizes them into four types: letters, digits, whitespace characters,
// and other characters.
// The counts of each type are stored in an integer array named counts, which is then returned as the result of the method.
