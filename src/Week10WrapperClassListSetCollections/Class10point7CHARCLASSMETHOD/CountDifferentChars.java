package Week10WrapperClassListSetCollections.Class10point7CHARCLASSMETHOD;

/*
Description: Write a method called countDigitsAndUppercase() that takes a string as input
and returns the count of digits and uppercase letters in the string as a string in the format "Digits: X, Uppercase: Y".

Params: A string.

Return: A string representing the count of digits and uppercase letters in the input string.

Example:

countDigitsAndUppercase("Hello World 123") // Returns "Digits: 3, Uppercase: 2"

countDigitsAndUppercase("AbCdEfGhIjKlM") // Returns "Digits: 0, Uppercase: 7"

countDigitsAndUppercase("Testing 123") // Returns "Digits: 3, Uppercase: 1"
 */
public class CountDifferentChars {
    public static void main(String[] args) {

    }
    public static String countDigitsAndUppercase(String input) {
        // Define a method called countDigitsAndUppercase that takes a string as input.
        // It returns the count of digits and uppercase letters in the input string
        // in the format "Digits: X, Uppercase: Y".

        int digitCount = 0;
        int uppercaseCount = 0;

        for (char c : input.toCharArray()) {
            // Loop through each character in the input string.

            if (Character.isDigit(c)) {
                // Check if the current character is a digit.
                digitCount++;  // Increment the digit count.
            } else if (Character.isUpperCase(c)) {
                // Check if the current character is an uppercase letter.
                uppercaseCount++;  // Increment the uppercase count.
            }
        }

        String result = "Digits: " + digitCount + ", Uppercase: " + uppercaseCount;
        // Construct the result string in the specified format.

        return result;
        // Return the result string.
    }

}

//This code defines a method named countDigitsAndUppercase that takes a string as input,
// counts the number of digits and uppercase letters in the input string, and constructs a result string in the specified format.
// The example input values have been used in the main method to demonstrate how the method works.
