package Week10WrapperClassListSetCollections.Class10point5WrapperClassParseMethodEx;

/*
Description: Write a method called countOccurrences() that takes an array of integers
and a string representation of a number as input, and returns the number of occurrences of the given number in the array.

Params: An array of integers. A string representation of a number.

Return: A string representing the number of occurrences of the given number in the array.

Example:

countOccurrences([1, 2, 3, 4, 5, 4, 3, 2, 1], "4") // Returns "2"

countOccurrences([1, 2, 3], "4") // Returns "0"

countOccurrences([], "4") // Returns "0"

Note:

You should use Integer.parseInt() to parse the input string into an integer.

You should use a loop to iterate over the array and count the number of occurrences of the given number.

The output should be returned as a string, not an integer
 */
public class CountOccurencesInArray {
    public static void main(String[] args) {

    }

    //In summary, this code defines a method countOccurrences that counts how many times the given target number
    // (converted from the input string) appears in the provided integer array.
    // It uses a loop to iterate through the array, checking if each element is equal to the target number.
    // The count of occurrences is then returned as a string.

    public static String countOccurrences(int[] numbers, String str) {
        // Define a method called countOccurrences that takes an array of integers and a string representation of a number.
        // It returns the number of occurrences of the given number in the array.

        int finder = Integer.parseInt(str);
        // Convert the input string 'str' into an integer using Integer.parseInt()
        // This integer will be used to find occurrences in the array.

        int counter = 0; // Initialize a variable 'counter' to keep track of the occurrences of the target number.

        for (int num : numbers) { // Start a loop that iterates through each element (num) in the 'numbers' array.

            if (num == finder) { // Check if the current element (num) is equal to the target number (finder).

                counter++; // If the current element matches the target number, increment the 'counter'.
            }
        }

        return Integer.toString(counter); // Convert the 'counter' value to a string using Integer.toString()
        // Return the string representing the number of occurrences of the target number in the array.
    }
}
